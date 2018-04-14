package cn.edu.whu.impl;

import cn.edu.whu.bean.User;
import cn.edu.whu.dao.UserMapper;
import cn.edu.whu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/13.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userDao;
    @Override
    public User vlogin(Integer uid) {
        User user =userDao.selectByPrimaryKey(uid);
        return user;
    }
}
