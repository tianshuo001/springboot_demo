package com.jj.controller;

import com.jj.entity.AppCode;
import com.jj.service.AppCodeService;
import com.jj.utils.common.RetResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author tianshuo
 * @Date 2021/3/16 14:41
 * @Version 1.0
 **/

@Controller
@RequestMapping(value = "/test")
@Api( tags = "springboot  测试")
public class TestController {
    private static final Logger logger = LogManager.getLogger(TestController.class);

    @Autowired
    private AppCodeService appCodeService;

    /**
     * @Author tianshuo
     * @Description 测试 spring boot 启动
     * @Date 2021/3/16 20:32 
     * @Param [name]
     * @return java.lang.String
    **/
    @RequestMapping(value = "/say_hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("测试 springboot 启动接口")
    public String testSpringbootStart(@PathVariable String name){
        logger.error("测试消息");
        return name + "start success!";
    }

    /**
     * @Author tianshuo
     * @Description 整合 mybatis 测试
     * @Date 2021/3/16 20:32
     * @Param []
     * @return com.jj.utils.common.RetResult
    **/
    @RequestMapping(value = "/get_codes", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("测试 mybatis 接口")
    public RetResult getCodes(){
        return appCodeService.getAppCodes();
    }

    /**
     * @Author tianshuo
     * @Description 测试 mybatis 的另一种写法
     * @Date 2021/3/16 20:33
     * @Param
     * @return
    **/
    @RequestMapping(value = "/get_codes_other", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("测试 mybatis 接口 另一种写法")
    public RetResult getCodeOtherMethod(){

        return appCodeService.getAppCodesOtherMethod();
    }
}
