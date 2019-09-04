package com.ccc.demoboot.service;


import com.ccc.demoboot.domain.Mrb;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.mapper.MrbMapper;
import com.ccc.demoboot.mapper.ShelfMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MrbServiceImpl implements MrbService {
@Resource
    ShelfMapper shelfMapper;

@Resource
    MrbMapper mrbMapper;

    @Override
    public List<Shelf> selAllShelf(Shelf shelf) {

        return shelfMapper.selectAll();
    }


    @Override
    public List<Shelf> selectAllByGoodid(Integer goodid) {

        return shelfMapper.selectAllByGoodid(goodid);
    }

    @Override
    public List<Mrb> selectAllMrb() {
        return mrbMapper.selectAll();
    }


}
