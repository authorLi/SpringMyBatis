package com.xgcyjd.dao;

import com.xgcyjd.po.Manager;

public interface ManagerMapper
{
    public void insertManager(Manager user) throws Exception;
    public Manager findManagerByStuId(Integer stu_id) throws Exception;
}
