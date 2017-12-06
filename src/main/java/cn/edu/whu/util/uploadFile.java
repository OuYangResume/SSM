package cn.edu.whu.util;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 上传文件到指定目录
 * Created by Administrator on 2017/12/6.
 */
public class uploadFile {
    public  static List uploadFileConfigurable(@RequestParam MultipartFile pic, HttpServletRequest request) throws IOException {
        List<Object> list=new ArrayList<Object>();
        //获取原始文件名
        String originalFilename=pic.getOriginalFilename();
        DateFormat df=new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String name=df.format(new Date());
        Random r=new Random();
        for (int i=0;i<3;i++){
            name +=r.nextInt(10);
        }
        String ext= FilenameUtils.getExtension(originalFilename);

        Calendar calendar=Calendar.getInstance();
        //获取年月日
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH+1);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
       String path=request.getSession().getServletContext().getRealPath("")+"data\\"+name+"."+ext;
        String path1="data";
        //绝对路径
        String url=request.getSession().getServletContext().getRealPath("")+path1;
        File dirFile=new File(url);
        //如果dir对应的文件不存在，或者不是一个目录，否则退出
        if(!dirFile.exists()||!dirFile.isDirectory()){
            dirFile.mkdir();
        }
        pic.transferTo(new File(path));
        //文件名字
        list.add(name);
        //文件的存储路径
        list.add(path);
        //文件的原始名
        list.add(originalFilename);
        return  list;
    }
}
