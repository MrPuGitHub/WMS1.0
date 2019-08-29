package com.ccc.demoboot.Controller;

import com.ccc.demoboot.service.EmpService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class EmpController {

    @Resource(name = "empServiceImpl")
    EmpService empService;
}
