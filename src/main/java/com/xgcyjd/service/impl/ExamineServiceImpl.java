package com.xgcyjd.service.impl;

import com.xgcyjd.dao.ExamineRecordMapper;
import com.xgcyjd.dao.ExamineSystemMapper;
import com.xgcyjd.dao.ManagerMapper;
import com.xgcyjd.dao.UserMapper;
import com.xgcyjd.po.ExamineRecord;
import com.xgcyjd.po.ExamineSystem;
import com.xgcyjd.po.Manager;
import com.xgcyjd.po.User;
import com.xgcyjd.service.ExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ExamineServiceImpl implements ExamineService {

    @Autowired
    ExamineSystemMapper examineSystemMapper;
    @Autowired
    ExamineRecordMapper examineRecordMapper;
    @Autowired
    ManagerMapper managerMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    public void addExamineSystem(ExamineSystem examineSystem) throws Exception {
        examineSystemMapper.insertExamineSystem(examineSystem);
    }

    @Override
    public List<ExamineSystem> getExamineSystem() throws Exception {
        return  examineSystemMapper.getExamineSystem();
    }

    @Override
    public void deleteExamineSystemById(int id) throws Exception {
        examineSystemMapper.deleteExamineSystem(id);
    }

    @Override
    public HashMap<String,Object> addExamineRecord(int examiner_stu_id,int examine_system_id) throws Exception {
       HashMap<String,Object> hashMap =new HashMap<>();
       Manager manager =  managerMapper.findManagerByStuId(examiner_stu_id);
       String post=  manager.getPost();
       String[] strings = post.split("|");
       if(strings.length>4){
           hashMap.put("status", -1);
           hashMap.put("message", "权限不够");
           return hashMap;
       }else {
           String s = strings[2];
           int j = Integer.parseInt(s);
           List<User> usersList = userMapper.getUserByGroup(Integer.parseInt(strings[2]));
           for (int i =0;i<usersList.size();i++) {
               ExamineRecord examineRecord = new ExamineRecord();
               examineRecord.setExaminer_stu_id(examiner_stu_id);
               examineRecord.setExamined_stu_id(usersList.get(i).getStu_id());
               examineRecord.setSystem_id(examine_system_id);
               examineRecordMapper.insertExamineRecord(examineRecord);
           }
           hashMap.put("Status", 0);//成功
           hashMap.put("message","OK");
           return hashMap;
       }

    }
}
