package com.xgcyjd.dao;

import com.xgcyjd.po.ArchivesDetail;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArchivesDetailMapper {
    public void insertArchivesDetail(ArchivesDetail archivesDetail);

    public List<ArchivesDetail> findArchivesDetailByAuthor(@Param(value = "author") int author
            , @Param(value = "pageStartPos") int pageStartPos, @Param(value = "pageSize") int pageSize);

    public int checkArchivesDetail(ArchivesDetail archivesDetail);

    public int getCount(int author);

    public void deleteArchivesDetailById(int id);
}
