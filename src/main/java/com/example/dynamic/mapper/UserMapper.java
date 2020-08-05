package com.example.dynamic.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.dynamic.constant.DBConstants;
import com.example.dynamic.dataobject.UserDo;
import org.apache.ibatis.annotations.Param;

@DS(DBConstants.DATASOURCE_USERS)
public interface UserMapper {

    UserDo selectById(@Param("id") Integer id);
}
