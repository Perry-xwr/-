package com.neusoft.elmboot.service;
import com.neusoft.elmboot.po.User;
import com.neusoft.elmboot.po.UserImg;
import com.neusoft.elmboot.po.UserPsd;
import org.apache.ibatis.annotations.Param;

public interface UserService {
 public User getUserByIdByPass(User user);
 public User getUserById(String userId);
 public int saveUser(User user);


    public User login(String username, String password);
    public int modifyPassword(UserPsd userPsd);

    public int changeUserPortrait(UserImg userImg);
}

