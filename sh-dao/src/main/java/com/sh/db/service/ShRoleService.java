package com.sh.db.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.db.dao.ShRoleMapper;
import com.sh.db.domain.ShRole;
import com.sh.db.domain.ShRoleExample;

@Service
public class ShRoleService {

	@Autowired
	private ShRoleMapper roleMapper;
	
    public Set<String> queryByIds(Integer[] roleIds) {
        Set<String> roles = new HashSet<String>();
        if(roleIds.length == 0){
            return roles;
        }

        ShRoleExample example = new ShRoleExample();
        example.or().andIdIn(Arrays.asList(roleIds)).andEnabledEqualTo(true).andDeletedEqualTo(false);
        List<ShRole> roleList = roleMapper.selectByExample(example);

        for(ShRole role : roleList){
            roles.add(role.getName());
        }

        return roles;

    }
}
