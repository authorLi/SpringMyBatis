
package com.xgcyjd.dao;

import com.xgcyjd.po.User;
import org.springframework.stereotype.Repository;
import java.sql.SQLException;
import java.util.List;


@Repository
public interface UserMapper
{
    public void insertUser(User user) throws SQLException;
    public User findUserByStuId(Integer stu_id) throws SQLException;
    public List<User> getUserByGroup(int group) throws  Exception;

}
