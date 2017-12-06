package cn.edu.whu.dao;

import cn.edu.whu.bean.School;

import java.util.List;

/**
 * Created by AJQK on 2017/7/31.
 */
public interface DefaultMapper {
    public void insertInfo(School schoole);
    public void insertSchoolInfo(List<School> schoolList);
}
