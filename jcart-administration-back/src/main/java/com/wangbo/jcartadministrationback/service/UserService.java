package com.wangbo.jcartadministrationback.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wangbo.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lqh
 * @since 2020-02-06
 */
public interface UserService extends IService<User> {

    int loginUser(User user, HttpSession session);

    boolean addUser(User user);

    boolean selectByName(String name1);
}
