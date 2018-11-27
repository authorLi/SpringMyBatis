package com.xgcyjd.controller;

import com.xgcyjd.po.Manager;
import com.xgcyjd.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class ManagerController
{
    @Autowired
    private  ManagerService managerService;

    @RequestMapping(value = "/uanager/login")
    @ResponseBody
    public HashMap<String,Object> login(@RequestBody Manager manager, HttpSession session ) throws Exception
    {

        System.out.println(manager);
       Manager record = managerService.login(manager);
       HashMap<String,Object> hashMap = new HashMap<>();

        if (record == null)
        {
            hashMap.put("state",-1);

            return hashMap; //用户不存在
        }
        else if (!record.getPassword().equals(manager.getPassword()))
        {
            hashMap.put("state",0);

            return hashMap; //密码不正确
        }else
        {
            session.setAttribute("manager",record);

            hashMap.put("state",1);
            hashMap.put("stu_id", record.getStu_id());
            hashMap.put("group", record.getGroup_id());

            return hashMap; //登陆成功
        }

    }
}
