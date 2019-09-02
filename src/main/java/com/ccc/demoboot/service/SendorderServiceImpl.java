package com.ccc.demoboot.service;

import com.ccc.demoboot.domain.Sendorder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.ccc.demoboot.mapper.SendorderMapper;

@Service
public class SendorderServiceImpl implements SendorderService {

    @Resource
    private SendorderMapper sendorderMapper;

    @Override
    public int inseretSendorder(Sendorder sendorder) {
        return sendorderMapper.insert(sendorder);
    }
}
