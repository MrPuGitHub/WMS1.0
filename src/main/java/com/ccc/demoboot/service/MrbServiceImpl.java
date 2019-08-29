package com.ccc.demoboot.service;


import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.mapper.ShelfMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MrbServiceImpl implements MrbService {
@Resource
    ShelfMapper shelfMapper;

    @Override
    public List<Shelf> selAllShelf() {
        return shelfMapper.selectAll();
    }
}
