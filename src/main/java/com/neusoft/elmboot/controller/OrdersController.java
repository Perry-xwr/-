package com.neusoft.elmboot.controller;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.neusoft.elmboot.po.Orders;
import com.neusoft.elmboot.service.OrdersService;
@RestController
@RequestMapping("/OrdersController")
public class OrdersController {
 @Autowired
 private OrdersService ordersService;

 @RequestMapping("/createOrders")
 public int createOrders(@RequestBody Orders orders) throws Exception{
  orders.setOpen(Integer.valueOf(orders.getOpens()));
  return ordersService.createOrders(orders);
 }

 @RequestMapping("/getOrdersById")
 public Orders getOrdersById(Orders orders) throws Exception{
  return ordersService.getOrdersById(orders.getOrderId());
 }

 @RequestMapping("/listOrdersByUserId")
 public List<Orders> listOrdersByUserId(Orders orders) throws Exception{
  return ordersService.listOrdersByUserId(orders.getUserId());
 }
//查询通过
 @RequestMapping("/pay")
 public void pay(Integer orderId) throws Exception{

  ordersService.pay(orderId);
 }

}