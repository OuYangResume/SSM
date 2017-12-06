package cn.edu.whu.controller;

import cn.edu.whu.bean.School;
import cn.edu.whu.service.DefaultService;
import cn.edu.whu.util.uploadFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Created by AJQK on 2017/7/31.
 */
@Controller
public class DefaultController {
    @Autowired
    private DefaultService DefaultService;

    @RequestMapping("/inserinfo")
    public ModelAndView Default(int type,String name,double x,double y){
        School school = new School();
        school.setName(name);
        school.setType(type);
        school.setX(x);
        school.setY(y);
        DefaultService.insertInfo(school);
        return new ModelAndView("redirect:/html/a.html");
    }
    @RequestMapping("/insertSchoolInfo")
    @ResponseBody
    public void InserSchoolInfo(@RequestParam("file") MultipartFile pic, HttpServletRequest request) throws IOException {
        List list= uploadFile.uploadFileConfigurable(pic,request);
        String path= (String) list.get(1);
        DefaultService.insertSchoolInfo(path);
    }
}

