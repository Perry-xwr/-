package com.neusoft.elmboot.controller;

import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.po.UserImg;
import com.neusoft.elmboot.po.UserPsd;
import com.neusoft.elmboot.po.image;
import com.neusoft.elmboot.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/UserController")
public class  UserController {

 @Autowired
 private UserService userService;

 @RequestMapping("/getUserByIdByPass")
 public User getUserByIdByPass(User user) throws Exception {
  return userService.getUserByIdByPass(user);
 }

 @RequestMapping("/getUserById")
 public User getUserById( User user) throws Exception {
  return userService.getUserById(user.getUserId());
 }

 @RequestMapping(value="/saveUser",method = RequestMethod.POST)
 public int saveUser(@Valid @RequestBody User user) throws Exception {
  return userService.saveUser(user);
 }

 @RequestMapping("/changeUserPortrait")//base64
 public int changeUserPortrait( @RequestBody UserImg userImg) throws Exception {
  return userService.changeUserPortrait(userImg);
 }

 @RequestMapping("/modifyPassword")
 public int modifyPassword(@RequestBody UserPsd userPsd) throws Exception {
  return userService.modifyPassword(userPsd);
 }

 @PostMapping("/login")
 public String login(@RequestBody User user) {
  User loggedInUser = userService.login(user.getUserName(), user.getPassword());
  if (loggedInUser != null) {
   return "Login successful";
  } else {
   return "Invalid username or password";
  }
 }
}
//通过