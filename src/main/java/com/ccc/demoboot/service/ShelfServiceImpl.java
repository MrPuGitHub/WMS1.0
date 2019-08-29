package com.ccc.demoboot.service;


import com.ccc.demoboot.mapper.ShelfMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShelfServiceImpl implements ShelfService{
@Resource
    ShelfMapper shelfMapper;

    @Override
    public List<ShelfMapper> selAllShelf() {
        return shelfMapper.selectAll();
    }
}
