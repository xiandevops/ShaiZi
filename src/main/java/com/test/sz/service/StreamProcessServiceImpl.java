package com.test.sz.service;

import com.test.sz.dao.TSDateDao;
import com.test.sz.dao.TSInfoDao;
import com.test.sz.dao.TSTop5Dao;
import com.test.sz.model.TSDate;
import com.test.sz.model.TSInfo;
import com.test.sz.model.TSTop5;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author paxos
 */
@Service
public class StreamProcessServiceImpl implements StreamProcessService {

    @Resource
    private TSInfoDao tSInfoDao;

    @Resource
    private TSDateDao tsDateDao;

    @Resource
    private TSTop5Dao tsTop5Dao;

    @Override
    public TSInfo queryDetail(TSInfo info) {
        return tSInfoDao.queryInfoDetail(info);
    }

    @Override
    @Transactional
    public void insertByList(List<TSInfo> info) {
        tSInfoDao.insertByList(info);
    }

    @Override
    public TSDate queryDate(TSDate date) {
        return null;
    }

    @Override
    @Transactional
    public void insertDate(TSDate date) {
        tsDateDao.insert(date);
    }

    @Override
    public TSDate queryTop5(TSTop5 top5) {
        return null;
    }

    @Override
    @Transactional
    public void insertTop5(TSTop5 top5) {
        tsTop5Dao.insert(top5);
    }


}