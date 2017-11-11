package cn.edu.whu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by AJQK on 2017/7/31.
 */
@Controller
@RequestMapping("")
public class DefaultController {
    @RequestMapping("")
    public ModelAndView Default(){
        return new ModelAndView("redirect:/html/index.html");
    }
}
