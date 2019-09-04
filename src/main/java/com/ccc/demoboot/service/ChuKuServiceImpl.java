package com.ccc.demoboot.service;


import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.mapper.ChuKuDanMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChuKuServiceImpl implements ChuKuService{

    @Resource
    ChuKuDanMapper chuKuDanMapper;

    //    查询所有的的出库单
    @Override
    public List<ChuKuDan> selAllChuKuDan() {

        return chuKuDanMapper.selectAll();
    }



    //    查询本周内的出库单
    @Override
    public List<ChuKuDan> selChuKuDanInWeek() {
        return chuKuDanMapper.selChuKuDanInWeek();
    }


    //    查询本月内的出库单
    @Override
    public List<ChuKuDan> selChuKuDanInMonth() {
        return chuKuDanMapper.selChuKuDanInMonth();
    }


    //    查询本季度内的出库单
    @Override
    public List<ChuKuDan> selChuKuDanInQuarter() {
        return chuKuDanMapper.selChuKuDanInQuarter();
    }



//    根据指定的出库单号，出库单状态，出库时间范围查询出库单
    @Override
    public List<ChuKuDan> selChuKuDanByTiaoJian(Integer chukuid, String state, String startTime, String endTime) {
        return chuKuDanMapper.selChuKuDanByTiaoJian(chukuid,state,startTime,endTime);
    }

//    根据订单生成出库单
    @Override
    public void insertChuKuDanByDingDan(ChuKuDan ck) {
        chuKuDanMapper.insertChuKuDanByDingDan(ck);
    }


    @Override
    public List<ChuKuDan> selAllToCaiGou() {
        return chuKuDanMapper.selAllToCaiGou();
    }

}
