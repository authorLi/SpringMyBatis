package com.xgcyjd.po;

public class Manager
{
    private int id;
    private int stu_id;
    private String name;
    private String password;
    private int group_id;
    private String post;
    private String mobile_phone;
    private String mail_box;
    private String QQ;
    private String remark;

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", stu_id=" + stu_id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", group_id=" + group_id +
                ", post='" + post + '\'' +
                ", mobile_phone='" + mobile_phone + '\'' +
                ", mail_box='" + mail_box + '\'' +
                ", QQ='" + QQ + '\'' +
                ", remark='" + remark + '\'' +
                '}';
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

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getMail_box() {
        return mail_box;
    }

    public void setMail_box(String mail_box) {
        this.mail_box = mail_box;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public int getId()
    {
        return id;
    }

    public Manager() {
    }

    public Manager(int stu_id, String password) {
        this.stu_id = stu_id;
        this.password = password;
    }


}
