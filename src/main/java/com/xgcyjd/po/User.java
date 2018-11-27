package com.xgcyjd.po;

public class User
{
    private int id;
    private int stu_id;
    private String name;
    private String password;
    private String mobile_phone;
    private int grade;
    private int group_id;
    private String QQ;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", stu_id=" + stu_id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", mobile_phone='" + mobile_phone + '\'' +
                ", grade=" + grade +
                ", group_id=" + group_id +
                ", QQ='" + QQ + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public User()
    {

    }

    public User(int stu_id, String password) {
        this.stu_id = stu_id;
        this.password = password;
    }


}
