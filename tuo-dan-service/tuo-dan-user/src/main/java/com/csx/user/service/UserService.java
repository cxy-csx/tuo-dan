package com.csx.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.csx.model.common.dtos.R;
import com.csx.model.user.dto.LoginDto;
import com.csx.model.user.entity.User;

public interface UserService extends IService<User> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public R login(LoginDto dto);
}
