package com.xgcyjd.controller;

import com.xgcyjd.po.ExamineSystem;
import com.xgcyjd.service.ExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class ExamineController {
    @Autowired
    ExamineService examineService;


    @ResponseBody
    @RequestMapping("/addExamineSystem")
    public HashMap<String,Object> addExamineSystem(@RequestBody ExamineSystem examineSystem) throws Exception{
        examineService.addExamineSystem(examineSystem);
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        hashMap.put("status",0);
        hashMap.put("examineSystem", examineSystem);
        return hashMap;
    }

    @ResponseBody
    @RequestMapping("/getExamineSystem")
    public HashMap<String ,Object> getExamineSystem() throws  Exception
    {
        List<ExamineSystem> list = examineService.getExamineSystem();
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("list",list);
        return hashMap;
    }

    @ResponseBody
    @RequestMapping("/deleteExamineSystem")
    public HashMap<String,Object> deleteExamineSystem(int id) throws  Exception
    {
        examineService.deleteExamineSystemById(id);
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("status", 0);
        return hashMap;
    }
    @ResponseBody
    @RequestMapping("/addExamineRecord")
    public HashMap<String,Object> addExamineRecord(int examiner_stu_id ,int examine_system_id) throws Exception{
        return examineService.addExamineRecord(examiner_stu_id, examine_system_id);
    }

}
