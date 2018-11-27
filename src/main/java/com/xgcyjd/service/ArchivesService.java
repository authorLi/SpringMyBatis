package com.xgcyjd.service;

import com.xgcyjd.po.Archives;
import com.xgcyjd.po.ArchivesDetail;

import java.util.HashMap;
import java.util.List;

public interface ArchivesService
{
    public void addArchives(ArchivesDetail archivesDetail) throws Exception;
    public HashMap<String,Object> findArchivesDetailByAuthor(int author , int pageNow) throws Exception;
    public void checkArchivesDetail(ArchivesDetail archivesDetail) throws Exception;
    public void deleteArchivesDetailById(int id) throws Exception;
    public void readArchives(Archives archives) throws Exception;
    public void sendArchives(ArchivesDetail archivesDetail) throws Exception;
}
