package cn.edu.whu.service;

import cn.edu.whu.bean.School;

import java.io.IOException;

/**
 * Created by Administrator on 2017/12/2.
 */
public interface DefaultService {
    public void insertInfo(School school);
    public void insertSchoolInfo(String path) throws IOException;
}
