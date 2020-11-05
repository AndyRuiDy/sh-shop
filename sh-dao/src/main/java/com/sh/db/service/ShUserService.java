package com.sh.db.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.db.dao.ShUserMapper;
import com.sh.db.domain.ShUser;
import com.sh.db.domain.ShUserExample;

@Service
public class ShUserService {
	
	@Autowired
	private ShUserMapper userMapper;
	
	/**
	 * 根据Id查找用户
	 * @param id
	 * @return
	 */
	public ShUser findByUserId(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 根据openId查找用户
	 * @param openId
	 * @return
	 */
	public ShUser findByOpenId(String openId) {
		ShUserExample example = new ShUserExample();
		example.or().andWeixinOpenidEqualTo(openId).andDeletedEqualTo(false);
		return userMapper.selectOneByExample(example);
	}
	
	public void add(ShUser user) {
		user.setAddTime(LocalDateTime.now());
		user.setUpdateTime(LocalDateTime.now());
		userMapper.insertSelective(user);
	}
	
	public int updateById(ShUser user) {
		user.setUpdateTime(LocalDateTime.now());
		return userMapper.updateByPrimaryKeySelective(user);
	}
	
	

}
