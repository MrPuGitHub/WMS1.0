package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.Pandian;

import java.util.List;

public interface PandianService {

    /////////////////////你好你好123123
    List<Pandian> selectAllPanDian();
  //搜索功能
    List<Pandian> selectAllPanDian(Pandian pd);

}
