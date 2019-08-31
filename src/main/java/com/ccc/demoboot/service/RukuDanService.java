package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.RuKuDan;

import java.util.List;

public interface RukuDanService {
    List<RuKuDan> selectByAll();
    RuKuDan selectById(Integer id);


}
