package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.ChuKuDan;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface ChuKuDanMapper  extends Mapper<ChuKuDan> {

    //    查询本周内的出库单
    List<ChuKuDan> selChuKuDanInWeek();

    //    查询本月内的出库单
    List<ChuKuDan> selChuKuDanInMonth();

    //    查询本季度内的出库单
    List<ChuKuDan> selChuKuDanInQuarter();

    //根据指定的出库单号，出库单状态，出库时间范围查询出库单
    List<ChuKuDan> selChuKuDanByTiaoJian(Integer chukuid,String state,String startTime,String endTime);

    //根据订单生成出库单
    void  insertChuKuDanByDingDan(ChuKuDan ck);











    //给采购的方法
    List<ChuKuDan> selAllToCaiGou();


}