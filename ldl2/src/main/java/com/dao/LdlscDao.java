package com.dao;

import com.pojo.LdlscUser;
import com.pojo.LdlscUser;

import java.util.List;

public interface LdlscDao {
    //增删改查
    //查询
     public List<LdlscUser> search(LdlscUser ldlscUser);
     //进行添加动作
     public int addLdlscUser(LdlscUser ldlscUser);

     public int delLdlscUser(LdlscUser ldlscUser);

     public LdlscUser getLdlscUser(LdlscUser ldlscUser);
    public int updateLdlscUser(LdlscUser ldlscUser);

    public List<LdlscUser> checkloginname(LdlscUser ldlscUser);

    }
