package com.example.dynamic.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.example.dynamic.constant.DBConstants;
import com.example.dynamic.dataobject.OrderDo;
import org.apache.ibatis.annotations.Param;

@DS(DBConstants.DATASOURCE_ORDERS)
public interface OrderMapper {

    OrderDo selectById(@Param("id") Integer id);

}
