package com.ccc.demoboot.service;



import com.ccc.demoboot.domain.Emp;
import com.ccc.demoboot.domain.Shelf;
import com.ccc.demoboot.mapper.ShelfMapper;

import java.util.List;

public interface MrbService {


   List<Shelf> selAllShelf (Shelf shelf);
   List<Shelf> selectAllByGoodid(Integer goodid);

}
