package com.ccc.demoboot.service;


import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.domain.Instore;
import com.ccc.demoboot.domain.Mrb;
import com.ccc.demoboot.mapper.ChuKuDanMapper;
import com.ccc.demoboot.mapper.InstoreMapper;
import com.ccc.demoboot.mapper.MrbMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChuKuServiceImpl implements ChuKuService{

    @Resource
    ChuKuDanMapper chuKuDanMapper;

    @Resource
    MrbMapper mrbMapper;


//    @Resource
//    InstoreMapper instoreMapper;

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
    public ChuKuDan selChuKuDanBuChukuid(Integer chukuid) {
        ChuKuDan c = new ChuKuDan();
        c.setChukuid(chukuid);
        List<ChuKuDan> select = chuKuDanMapper.select(c);
        c = select.get(0);
        return c;
    }


    @Override
    public List<ChuKuDan> selAllToCaiGou() {
        return chuKuDanMapper.selAllToCaiGou();
    }


    //    给采购管理提供的方法
//    返回根据入库单中商品id查询总数量的方法
    @Override
    public List<Instore> selAllRuKuGood(Integer goodId) {
        return chuKuDanMapper.selAllRuKuGood(goodId);
    }

    @Override
    public List<Mrb> selAllMrb() {
        return mrbMapper.selectAll();
    }

    @Override
    public List<Mrb> selAllMrbByOrderid(Integer orderId) {
        return mrbMapper.selAllMrbByOrderid(orderId);
    }

}
