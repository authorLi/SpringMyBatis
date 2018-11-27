package com.xgcyjd.po;

import java.util.Date;

public class ExamineRecord {
    private int id;
    private Date time;
    private int examiner_stu_id;
    private int examined_stu_id;
    private int system_id;
    private String detail;
    private int grade;
    private String remark;
    private int state;

    @Override
    public String toString() {
        return "ExamineRecord{" +
                "id=" + id +
                ", time=" + time +
                ", examiner_stu_id=" + examiner_stu_id +
                ", examined_stu_id=" + examined_stu_id +
                ", system_id=" + system_id +
                ", detail='" + detail + '\'' +
                ", grade=" + grade +
                ", remark='" + remark + '\'' +
                ", state=" + state +
                '}';
    }

    public ExamineRecord() {
    }

    public ExamineRecord(int id, Date time, int examiner_stu_id, int examined_stu_id, int system_id, String detail, int grade, String remark, int state) {
        this.id = id;
        this.time = time;
        this.examiner_stu_id = examiner_stu_id;
        this.examined_stu_id = examined_stu_id;
        this.system_id = system_id;
        this.detail = detail;
        this.grade = grade;
        this.remark = remark;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getExaminer_stu_id() {
        return examiner_stu_id;
    }

    public void setExaminer_stu_id(int examiner_stu_id) {
        this.examiner_stu_id = examiner_stu_id;
    }

    public int getExamined_stu_id() {
        return examined_stu_id;
    }

    public void setExamined_stu_id(int examined_stu_id) {
        this.examined_stu_id = examined_stu_id;
    }

    public int getSystem_id() {
        return system_id;
    }

    public void setSystem_id(int system_id) {
        this.system_id = system_id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
