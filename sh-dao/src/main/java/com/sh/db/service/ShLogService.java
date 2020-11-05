package com.sh.db.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.db.dao.ShLogMapper;
import com.sh.db.domain.ShLog;

@Service
public class ShLogService {
	
	@Autowired
	private ShLogMapper logMapper;
	
	public void add(ShLog log) {
        log.setAddTime(LocalDateTime.now());
        log.setUpdateTime(LocalDateTime.now());
        logMapper.insertSelective(log);
    }

}
