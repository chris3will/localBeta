package com.springboot.hotel.demo.controller;

import com.springboot.hotel.demo.entity.Orders;
import com.springboot.hotel.demo.entity.OrdersExample;
import com.springboot.hotel.demo.service.OrderService;
import com.springboot.hotel.demo.utils.Result;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
//@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    //查询某一个orderId=1的订单
    @RequestMapping("selectOrderById")
    @ResponseBody
    public Orders selectOrderById(){
        String orderId = "1";
        return orderService.selectById(orderId);
    }

    //连表查询，增加了username属性
    @RequestMapping("selectOrderByIds")
    @ResponseBody
    public Orders selectOrderByIds(){
        String orderId = "1";
        return orderService.selectByIds(orderId);
    }

    //6-13中午开始写关于订单的查询
    //假设已经创建了一些订单，
    //查询订单，且是未付款订单，这是已经下单的
    @GetMapping("/api/myAllOrders")
    @ResponseBody
    public Object myAllOrders(@RequestParam("username") String username){
        //这个需要订单和user的联名
        return Result.success(orderService.showMyAllOrder(username),"返回成功");
    }

    //通过传入不同的statusCode来进行不同的返回值传递
    //第二个参数默认是未支付，但是可以通过传入参数查询具体门类的订单
    @GetMapping("/api/mySpecificOrders")
    @ResponseBody
    public Object myOrders(@RequestParam("username") String username, @RequestParam(value = "statusCode",defaultValue = "1") int statusCode){
        //这个需要订单和user的联名
        return Result.success(orderService.showOrders(username,statusCode),"返回成功");
    }

    //未付款订单确认支付
    @PostMapping("/api/updateOrdersState")
    @ResponseBody
    //required=false 是hard coding
    //post请求参数较多的时候，采用Map可以有效解决问题
    public Object updateOrderState(@RequestBody Map params){
        //默认只要发起下单即更改预约时间，直到该订单取消时将其预约日期清楚
        //更新未支付订单的状态，当前先执行支付功能，
        //
        //想进行状态更新的订单有好几种，状态2：已下单未支付，其可以转换为取消0或已支付3；状态3：已支付未入住，其可以转换为取消0或已入住4；之后如果想加状态再添加即可
        //而无论该订单当前处于那个状态，如果新状态为0，则都对应着取消操作，都应该更新订单中的预定日期字段
        //但是可能会遇到不可无理由退款的店铺，这一点可以下一个sprint再加强
        Integer orderId1 = (Integer) params.get("orderId");
        Integer newOrderState1 = (Integer) params.get("newOrderState");
//        System.out.println("正在接收参数orderId"+orderId1);
//        System.out.println("正在接收参数newOrderState"+newOrderState1);
        //先搜索出该订单原本的订单状态是什么
        Orders order = new Orders();
        OrdersExample ordersExample = new OrdersExample();
        ordersExample.createCriteria().andOrderidEqualTo(orderId1);
        order=orderService.selectOneByExample(ordersExample);
        if(order==null){
            Result.fail("未找到该订单信息，请重新查询");
        }
        int oldOrderState = order.getOrderstatus();
        if(orderService.updateOrderState(orderId1,newOrderState1)>=1){
            //更新状态成功，也代表支付成功。具体的前端形式可以自由发挥
            if(newOrderState1==1){
                //我应该加一条，看看用户的状态之前是什么状态
                if(oldOrderState==2){
                    return Result.success(orderId1,"订单信息更新成功，原来是未付款，现在已经取消！");
                }else if(oldOrderState==3){
                    return Result.success(orderId1,"订单信息更新成功，原来是已付款未入住状态，现已经取消！");
                }else if(oldOrderState==4){
                    return Result.success(orderId1,"订单信息更新成功，原来是已执行状态，现在用户入住结束，订单状态回滚！");
                }else if(oldOrderState==1){
                    return Result.success(orderId1,"订单状态未发生改变，无需更新！");
                }
                return Result.fail(oldOrderState,"订单信息有误！");
            }else if(newOrderState1==2){
                return Result.success(orderId1,"订单信息更新成功，当前订单已处于待付款状态！");
            }else if(newOrderState1==3){
                return Result.success(orderId1,"订单信息更新成功，当前订单已处于已支付状态，等待执行！");
            }else if(newOrderState1==4){
                return Result.success(orderId1,"订单信息更新成功，当前订单处于已执行状态，即用户已经入住");
            }
            return Result.fail(orderId1,"订单信息更新成功，但目前的状态标号不属于数据库中预定义的状态！");
        }else{
            //更新状态失败
            return Result.fail(orderId1,"订单支付失败，请重新尝试");
        }
    }

}
