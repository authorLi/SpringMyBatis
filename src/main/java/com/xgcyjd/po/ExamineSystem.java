package com.xgcyjd.po;

public class ExamineSystem {
    private int id;
    private String examine_item;
    private String description;
    private String standard;
    private String remark;

    @Override
    public String toString() {
        return "ExamineSystemMapper{" +
                "id=" + id +
                ", examine_item='" + examine_item + '\'' +
                ", description='" + description + '\'' +
                ", standard='" + standard + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExamine_item() {
        return examine_item;
    }

    public void setExamine_item(String examine_item) {
        this.examine_item = examine_item;
    }

    public String getDescripition() {
        return description;
    }

    public void setDescripition(String description) {
        this.description = description;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
