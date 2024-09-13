package com.imooc.controller;

import com.imooc.grace.result.GraceJSONResult;
import com.imooc.grace.result.ResponseStatusEnum;
import com.imooc.model.Stu;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "Hello测试接口")
@Slf4j
public class HelloController {
    @GetMapping("hello")
    @ApiOperation(value = "返回测试")
    public Object hello(){
        Stu stu = new Stu("imooc", 18);
        log.debug(stu.toString());
        return GraceJSONResult.ok(stu);
//        return GraceJSONResult.errorCustom(ResponseStatusEnum.SYSTEM_RESPONSE_NO_INFO);
    }
}
