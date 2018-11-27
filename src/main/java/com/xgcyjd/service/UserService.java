package com.xgcyjd.service;

import com.xgcyjd.po.User;

public interface UserService
{
    public Integer regist(User user) throws Exception;
    public User login(Integer stu_id) throws Exception;
}
