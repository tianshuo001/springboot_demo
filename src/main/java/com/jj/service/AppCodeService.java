package com.jj.service;

import com.jj.dao.AppCodeDao;
import com.jj.entity.AppCode;
import com.jj.utils.common.RetResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @ClassName TestService
 * @Description TODO
 * @Author tianshuo
 * @Date 2021/3/16 16:19
 * @Version 1.0
 **/

@Service
public class AppCodeService {

    @Autowired
    private AppCodeDao appCodeDao;

    public RetResult getAppCodes(){
        return new RetResult(appCodeDao.getAppCodes());
    }

    public RetResult getAppCodesOtherMethod(){
        return new RetResult(appCodeDao.getAppCodesOtherMethod());
    }
}
