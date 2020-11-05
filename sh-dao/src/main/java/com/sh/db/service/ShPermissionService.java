package com.sh.db.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.db.dao.ShPermissionMapper;
import com.sh.db.domain.ShPermission;
import com.sh.db.domain.ShPermissionExample;

@Service
public class ShPermissionService {

	@Autowired
	private ShPermissionMapper permissionMapper;
	
	public Set<String> queryByRoleIds(Integer[] roleIds){
		Set<String> permissions = new HashSet<String>();
        if(roleIds.length == 0){
            return permissions;
        }

        ShPermissionExample example = new ShPermissionExample();
        example.or().andRoleIdIn(Arrays.asList(roleIds)).andDeletedEqualTo(false);
        List<ShPermission> permissionList = permissionMapper.selectByExample(example);

        for(ShPermission permission : permissionList){
            permissions.add(permission.getPermission());
        }

        return permissions;
	}
}
