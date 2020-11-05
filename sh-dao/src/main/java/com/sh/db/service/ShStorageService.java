package com.sh.db.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.github.pagehelper.PageHelper;
import com.sh.db.dao.ShStorageMapper;
import com.sh.db.domain.ShStorage;
import com.sh.db.domain.ShStorageExample;

@Service
public class ShStorageService {
	
	@Autowired
    private ShStorageMapper storageMapper;

    public void deleteByKey(String key) {
        ShStorageExample example = new ShStorageExample();
        example.or().andKeyEqualTo(key);
        storageMapper.logicalDeleteByExample(example);
    }

    public void add(ShStorage storageInfo) {
        storageInfo.setAddTime(LocalDateTime.now());
        storageInfo.setUpdateTime(LocalDateTime.now());
        storageMapper.insertSelective(storageInfo);
    }

    public ShStorage findByKey(String key) {
    	ShStorageExample example = new ShStorageExample();
        example.or().andKeyEqualTo(key).andDeletedEqualTo(false);
        return storageMapper.selectOneByExample(example);
    }

    public int update(ShStorage storageInfo) {
        storageInfo.setUpdateTime(LocalDateTime.now());
        return storageMapper.updateByPrimaryKeySelective(storageInfo);
    }

    public ShStorage findById(Integer id) {
        return storageMapper.selectByPrimaryKey(id);
    }

    public List<ShStorage> querySelective(String key, String name, Integer page, Integer limit, String sort, String order) {
    	ShStorageExample example = new ShStorageExample();
    	ShStorageExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(key)) {
            criteria.andKeyEqualTo(key);
        }
        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, limit);
        return storageMapper.selectByExample(example);
    }
}
