package com.ccc.demoboot.service;



import com.ccc.demoboot.domain.Mrb;
import com.ccc.demoboot.domain.Shelf;

import java.util.List;

public interface MrbService {


   List<Shelf> selAllShelf (Shelf shelf);
   List<Shelf> selectAllByGoodid(Integer goodid);
   List<Mrb> selectAllMrb();
}
