package cn.edu.whu.controller;

import cn.edu.whu.annotation.SystemLog;
import cn.edu.whu.bean.User;
import cn.edu.whu.enums.PageEnum;
import cn.edu.whu.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Created by Administrator on 2018/4/13.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @SystemLog(description = "伪登录")
    @RequestMapping(value = "/vlogin", method = RequestMethod.GET)
    public String vlogin(HttpSession httpSession, HttpServletRequest request, HttpServletResponse response, @RequestParam Integer uid) {
        User user=userService.vlogin(uid);

        if(user !=null){
            httpSession.setAttribute("user",user);
            request.setAttribute("page", PageEnum.INDEX.getCode());
        }else {
            request.setAttribute("page",PageEnum.LOGIN_HINT.getCode());
        }
        return "返回成功！";
    }
}
