package com.xgcyjd.controller;

import com.xgcyjd.po.Archives;
import com.xgcyjd.po.ArchivesDetail;
import com.xgcyjd.service.ArchivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;

@Controller
public class ArchivesController
{

    @Autowired
    ArchivesService archivesService;

    @ResponseBody
    @RequestMapping("/addArchivesDetail")
    public void addArchives(@RequestBody  ArchivesDetail archivesDetail) throws Exception
    {
        archivesService.addArchives(archivesDetail);
    }

    @ResponseBody
    @RequestMapping(value = "/findArchivesDetailByAuthor")
    public HashMap<String , Object> findArchivesDetailByAuthor(@RequestParam(value = "author") int author ,
                                                               @RequestParam(value = "pageNow") int pageNow) throws Exception
    {
        HashMap<String,Object> hashMap;
        hashMap = archivesService.findArchivesDetailByAuthor(author, pageNow);
        return hashMap;
    }

    @ResponseBody
    @RequestMapping("/uanager/checkArchivesDetail")
    public HashMap<String, Object> checkArchivesDetail(@RequestBody ArchivesDetail archivesDetail) throws Exception
    {
        archivesService.checkArchivesDetail(archivesDetail);
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("archivesDetail" ,archivesDetail);
        return hashMap;
    }
    @ResponseBody
    @RequestMapping("/deleteArchivesDetail")
    public HashMap<String,Object> deleteArchivesDetail( int id) throws Exception
    {
        archivesService.deleteArchivesDetailById(id);
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("status",0);
        hashMap.put("id", id);
        return hashMap;
    }
    @ResponseBody
    @RequestMapping(value = "/readArchives")
    public HashMap<String,Object> readArchives( int user_id, int archives_detail_id) throws Exception{
        Archives archives = new Archives();
        HashMap<String,Object> hashMap = new HashMap<>();
        archives.setUser_id(user_id);
        archives.setArchives_detail_id(archives_detail_id);
        archivesService.readArchives(archives);
        hashMap.put("user_id",user_id);
        hashMap.put("archives_detail_id",archives_detail_id);
        return hashMap;
    }
    @ResponseBody
    @RequestMapping("/sendArchives")
    public HashMap<String,Object> sendArchives(ArchivesDetail archivesDetail) throws Exception{
        archivesService.sendArchives(archivesDetail);
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("archivesDetail" ,archivesDetail);
        return hashMap;
    }
}
