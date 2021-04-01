package com.jj.dao;

import com.jj.entity.AppCode;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface AppCodeDao {

    List<AppCode> getAppCodes();

    @Select("select id, app_id, app_name from app_codes")
    @Results({
            @Result(id=true, column = "id", property = "id"),
            @Result(column = "app_id", property = "appId"),
            @Result(column = "app_name", property = "appName")
    })
    List<AppCode> getAppCodesOtherMethod();
}
