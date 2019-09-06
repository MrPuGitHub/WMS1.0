package com.ccc.demoboot.mapper;


import com.ccc.demoboot.domain.Mrb;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface MrbMapper extends Mapper<Mrb> {
    //将商品加入货架
    void addgood(Integer goodId,Integer goodNum,Integer id);
    List<Mrb> selAllMrbByOrderid(Integer orderId);
}