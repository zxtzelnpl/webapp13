package com.zxt.user;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service("userService")
public class UserService {
    @Resource
    private UserDao userDao;

    public UserModel getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

    public List<UserModel> getAllUsers(){
        return this.userDao.selectAllUsers();
    }

    public void addUser(UserModel user){
        this.userDao.insertOneUser(user);
    }

}
