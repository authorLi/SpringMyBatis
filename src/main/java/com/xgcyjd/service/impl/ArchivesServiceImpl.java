package com.xgcyjd.service.impl;

import com.xgcyjd.dao.ArchivesDetailMapper;
import com.xgcyjd.dao.ArchivesMapper;
import com.xgcyjd.po.Archives;
import com.xgcyjd.po.ArchivesDetail;
import com.xgcyjd.po.Page;
import com.xgcyjd.service.ArchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ArchivesServiceImpl implements ArchivesService {

    @Autowired
    ArchivesDetailMapper archivesDetailMapper;
    @Autowired
    ArchivesMapper archivesMapper;

    @Override
    public void addArchives(ArchivesDetail archivesDetail) throws Exception {
        archivesDetailMapper.insertArchivesDetail(archivesDetail);
    }

    @Override
    public HashMap<String, Object> findArchivesDetailByAuthor(int author, int pageNow) throws Exception {
        Page page = null;
        List<ArchivesDetail> list = new ArrayList<>();
        HashMap<String, Object> hashMap = new HashMap<>();
        int totalCount = archivesDetailMapper.getCount(author);
        page = new Page(pageNow, totalCount);
        page.setTotalPageCount(page.getTotalPageCount());
        list = archivesDetailMapper.findArchivesDetailByAuthor(author, page.getStartPos(), page.getPageSize());
        hashMap.put("ArchivesDetail", list);
        hashMap.put("page", page);
        return hashMap;
    }


    @Override
    public void checkArchivesDetail(ArchivesDetail archivesDetail) throws Exception {
        archivesDetailMapper.checkArchivesDetail(archivesDetail);
    }

    @Override
    public void deleteArchivesDetailById(int id) throws Exception {
        archivesDetailMapper.deleteArchivesDetailById(id);
    }

    @Override
    public void readArchives(Archives archives) {
        archivesMapper.readArchivesDetail(archives);
    }

    @Override
    public void sendArchives(ArchivesDetail archivesDetail) {
        String string = archivesDetail.getReceiver();
        String[] receivers = string.split("|");
        ArrayList<Archives> archivesList = new ArrayList<Archives>();
        for (int i = 0; i < receivers.length; i=i+2) {
            Archives archives = new Archives();
            archives.setArchives_detail_id(archivesDetail.getId());
            archives.setUser_id(Integer.parseInt(receivers[i]));
            archives.setState(0);
            archivesList.add(archives);
        }
        archivesMapper.insertArchives(archivesList);
    }
}
