package com.csx.user.controller.v1;

import com.csx.model.common.dtos.R;
import com.csx.model.user.dto.LoginDto;
import com.csx.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/user")
@Api(value = "小程序用户模块", tags = "用户模块")
public class UserAuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ApiOperation("用户登录")
    public R login(@RequestBody LoginDto dto) {
        return userService.login(dto);
    }
}
