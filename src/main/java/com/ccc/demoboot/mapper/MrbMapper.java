package com.ccc.demoboot.mapper;

import com.ccc.demoboot.domain.ChuKuDan;
import com.ccc.demoboot.domain.Mrb;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface MrbMapper  extends Mapper<Mrb> {
    List<Mrb> selAllMrbByOrderid(Integer orderId);
}