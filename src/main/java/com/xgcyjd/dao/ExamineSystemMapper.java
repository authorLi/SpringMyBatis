package com.xgcyjd.dao;

import com.xgcyjd.po.ExamineSystem;

import java.util.List;

public interface ExamineSystemMapper {
    public void insertExamineSystem(ExamineSystem examineSystem);
    public List<ExamineSystem> getExamineSystem();
  //  public void updateExamineSystem(ExamineSystem examineSystem);
    public void deleteExamineSystem(int id);
}
