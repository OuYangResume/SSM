package cn.edu.whu.service;

import cn.edu.whu.bean.OperateLogInfo;

/**
 * Created by Administrator on 2018/4/13.
 */
public interface OperateLogInfoService {
    int insert(OperateLogInfo operateLogInfo);

    int update(OperateLogInfo operateLogInfo);
}
