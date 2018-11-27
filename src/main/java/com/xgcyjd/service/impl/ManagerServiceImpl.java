package com.xgcyjd.service.impl;

import com.xgcyjd.dao.ManagerMapper;
import com.xgcyjd.po.Manager;
import com.xgcyjd.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerServiceImpl implements ManagerService
{
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public Manager login(Manager manager) throws Exception
    {
      return managerMapper.findManagerByStuId(manager.getStu_id());
    }
}
