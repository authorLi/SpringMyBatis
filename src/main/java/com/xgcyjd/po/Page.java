package com.xgcyjd.po;

public class Page {
    private int pageNow = 1; //当前默认页数
    private int pageSize = 5;//每页显示的最大记录数
    private int totalPageCount; //总页数
    private int totalCount; //总记录数
    private int startPos;

    public Page(int pageNow, int totalCount) {
        this.pageNow = pageNow;
        this.totalCount = totalCount;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPageCount() {
        totalPageCount = getTotalCount()/getPageSize();
        return (getTotalCount()%pageSize == 0) ? totalPageCount : totalPageCount+1;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getStartPos() {
        return (pageNow- 1)*pageSize+1;
    }

}
