package com.ccc.demoboot.service;



import com.ccc.demoboot.domain.ChuKuDan;

import java.util.List;

public interface ChuKuService {

    //    查询所有的的出库单
    List<ChuKuDan>  selAllChuKuDan();

    //    查询本周内的出库单
    List<ChuKuDan> selChuKuDanInWeek();

    //    查询本月内的出库单
    List<ChuKuDan> selChuKuDanInMonth();

    //    查询本季度内的出库单
    List<ChuKuDan> selChuKuDanInQuarter();

    //根据指定的出库单号，出库单状态，出库时间范围查询出库单
    List<ChuKuDan> selChuKuDanByTiaoJian(Integer chukuid,String state,String startTime,String endTime);


    //给采购的方法
    List<ChuKuDan> selAllToCaiGou();

}
