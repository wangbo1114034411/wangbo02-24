package com.wangbo.jcartadministrationback.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.wangbo.entity.User;
import com.wangbo.jcartadministrationback.dao.UserMapper;
import com.wangbo.jcartadministrationback.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lqh
 * @since 2020-02-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper mapper;


    @Override
    public boolean selectByName(String name1) {
        User u = mapper.selectOne(new QueryWrapper<User>().eq("username",name1));


        if(u!=null){
            return true;
        }
        return false;
    }

    @Override
    public boolean addUser(User user) {
        int num = mapper.insert(user);
        if(num!=0){
            return true;
        }

        return false;
    }

    @Override
    public int loginUser(User user, HttpSession session) {


        //获取和用户名一致的数据
        User u = mapper.selectOne(new QueryWrapper<User>().eq("username",user.getUsername()));


        if(u!=null){
            if(u.getPassword().equals(user.getPassword())){
                session.setAttribute("user", u);
                    return 1;//登录成功

            }else{
                return 0;//密码不一致
            }
        }else{
            return 2;//错误，用户名不存在
        }
    }

}
