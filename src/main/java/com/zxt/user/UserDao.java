package com.zxt.user;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;
import java.util.List;

public interface UserDao {
    @Select("select * from user where userId = #{userId}")
    UserModel selectByPrimaryKey(int userId);

    @Select("select * from user")
    List<UserModel> selectAllUsers();

    @Insert("insert into user " +
            "(userName,userPassword,userSex,userHome,userInfo,userEmail,userMoney) " +
            "VALUES " +
            "(#{userName},#{userPassword},#{userSex},#{userHome},#{userInfo},#{userEmail},#{userMoney})"
    )
    void insertOneUser(UserModel user);

    @Update("update user set userMoney = userMoney #{arg0} #{arg1} where userId = #{arg2}")
    void updateMoney(char action,BigDecimal changeMoney, int userId);

    @Update("update user set userMoney = userMoney - #{arg0} where userId = #{arg1}")
    void reduceMoney(BigDecimal changeMoney, int userId);

    @Update("update user set userMoney = userMoney + #{arg0} where userId = #{arg1}")
    void addMoney(BigDecimal changeMoney, int userId);
}
