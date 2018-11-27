package com.xgcyjd.controller;

import com.xgcyjd.po.User;
import com.xgcyjd.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @ResponseBody
    @RequestMapping(value = "/user/regist")
    public HashMap<String,Object> regist(@RequestBody User user) throws Exception {

        HashMap<String,Object> hashMap = new HashMap<String,Object>();

        hashMap.put("state", userServiceImpl.regist(user));

        return hashMap;
    }

    @ResponseBody
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public HashMap<String, Object> login(@RequestBody User user, HttpSession session) throws Exception {
        HashMap<String, Object> hashMap = new HashMap<>();
        User record = userServiceImpl.login(user.getStu_id());

        if (record == null) {
            hashMap.put("state", -1);
            return hashMap; //用户不存在
        } else if (!record.getPassword().equals(user.getPassword())) {
            hashMap.put("state", 0);
            return hashMap; //密码不正确
        } else {
            session.setAttribute("user", record);
            hashMap.put("stu_id", record.getStu_id());
            hashMap.put("group", record.getGroup_id());
            hashMap.put("grade", record.getGrade());
            hashMap.put("state", 1);

            return hashMap; //登陆成功
        }

    }
}
