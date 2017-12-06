package cn.edu.whu.impl;

import cn.edu.whu.bean.School;
import cn.edu.whu.dao.DefaultMapper;
import cn.edu.whu.service.DefaultService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/12/2.
 */
@Service
public class  DefaultServiceImpl implements DefaultService {
    @Autowired DefaultMapper DefaultMapper;
    public void insertInfo(School school) {
        DefaultMapper.insertInfo(school);
    }
    //解析excel。存入mysql数据库
    public void insertSchoolInfo(String path) throws IOException{
        InputStream inputStream=new FileInputStream(path);
        List<School> schoolList=new ArrayList<School>();
        HSSFWorkbook hssfWorkbook =new HSSFWorkbook(inputStream);
        for(int numSheet=0;numSheet<hssfWorkbook.getNumberOfSheets();numSheet++){
            HSSFSheet hssfSheet=hssfWorkbook.getSheetAt(numSheet);//获取sheet
            if (hssfSheet==null){
                continue;
            }
            for (int rowNum=0;rowNum<=hssfSheet.getLastRowNum();rowNum++){
                HSSFRow hssfRow=hssfSheet.getRow(rowNum+1);//读取第一行
                if(hssfRow!=null){
                    School school=new School();
                    HSSFCell Name=hssfRow.getCell(5);
                    HSSFCell Type=hssfRow.getCell(12);
                    HSSFCell X=hssfRow.getCell(10);
                    HSSFCell Y=hssfRow.getCell(11);
                    school.setName(Name.getStringCellValue());
                    school.setType((int)Type.getNumericCellValue());
                    school.setX(Double.valueOf(X.getNumericCellValue()));
                    school.setY(Double.valueOf(Y.getNumericCellValue()));
                    schoolList.add(school);
                }
            }
        }
        DefaultMapper.insertSchoolInfo(schoolList);
    }
}
