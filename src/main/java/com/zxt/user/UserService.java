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

    public void updateMoney(char action, BigDecimal changeMoney, int userId){
        this.userDao.updateMoney(action,changeMoney,userId);
    }

    public void reduceMoney(BigDecimal changeMoney, int userId){
        this.userDao.reduceMoney(changeMoney,userId);
    }

    public void addMoney(BigDecimal changeMoney, int userId){
        this.userDao.addMoney(changeMoney,userId);
    }
}
