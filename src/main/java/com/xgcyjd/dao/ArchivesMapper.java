package com.xgcyjd.dao;

import com.xgcyjd.po.Archives;

import java.util.ArrayList;

public interface ArchivesMapper {
    public void insertArchives(ArrayList<Archives> arrayList);
    public int readArchivesDetail(Archives archives);
}
