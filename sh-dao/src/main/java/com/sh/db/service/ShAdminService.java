package com.sh.db.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.db.dao.ShAdminMapper;
import com.sh.db.domain.ShAdmin;
import com.sh.db.domain.ShAdminExample;

@Service
public class ShAdminService {
	
	@Autowired
	private ShAdminMapper adminMapper;
	
	/**
	 * 根据用户名查找系统用户
	 * @param username
	 * @return
	 */
	public List<ShAdmin> findAdmin(String username){
		ShAdminExample example = new ShAdminExample();
		example.or().andUsernameEqualTo(username).andDeletedEqualTo(false);
        return adminMapper.selectByExample(example);
	}
	
	/**
	 * 根据ID更新系统用户
	 * @param admin
	 * @return
	 */
	public int updateById(ShAdmin admin) {
        admin.setUpdateTime(LocalDateTime.now());
        return adminMapper.updateByPrimaryKeySelective(admin);
    }

}
