package com.xgcyjd.service.impl;

import com.xgcyjd.dao.UserMapper;
import com.xgcyjd.po.User;
import com.xgcyjd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    UserMapper userMapper;
    /**
     *注册用户，如果成功插入则返回1，否则返回0代表用户存在
     */
    @Override
    public Integer regist(User user) throws SQLException
    {
        User record = userMapper.findUserByStuId(user.getStu_id());
        if (record == null) {
            userMapper.insertUser(user);
            return 1;//成功插入
        }else {
            return 0;//该用户已存在
        }

    }


    @Override
    public User login(Integer stu_id) throws Exception
    {
        return userMapper.findUserByStuId(stu_id);

    }
}
