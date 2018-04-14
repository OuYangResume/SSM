package cn.edu.whu.impl;

import cn.edu.whu.bean.OperateLogInfo;
import cn.edu.whu.dao.OperateLogInfoMapper;
import cn.edu.whu.service.OperateLogInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/13.
 */
@Service("operateLogInfoService")
public class OperateLoginfoServiceImpl implements OperateLogInfoService {

    @Resource
    private OperateLogInfoMapper operateLogInfoDao;
    @Override
    public int insert(OperateLogInfo operateLogInfo) {
        int count = operateLogInfoDao.insertSelective(operateLogInfo);
        return count;
    }

    @Override
    public int update(OperateLogInfo operateLogInfo) {
       return operateLogInfoDao.updateByPrimaryKeySelective(operateLogInfo);
    }
}
