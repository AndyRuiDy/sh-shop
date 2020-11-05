package com.sh.db.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.db.dao.ShGrouponRulesMapper;
import com.sh.db.domain.ShGrouponRules;
import com.sh.db.domain.ShGrouponRulesExample;

@Service
public class ShGrouponRulesService {

	@Autowired
	private ShGrouponRulesMapper grouponRulesMapper;
	
	public List<ShGrouponRules> queryByStatus(Short status) {
        ShGrouponRulesExample example = new ShGrouponRulesExample();
        example.or().andStatusEqualTo(status).andDeletedEqualTo(false);
        return grouponRulesMapper.selectByExample(example);
    }
	
	public ShGrouponRules findById(Integer id) {
		return grouponRulesMapper.selectByPrimaryKey(id);
	}
	
	public int updateById(ShGrouponRules grouponRules) {
        grouponRules.setUpdateTime(LocalDateTime.now());
        return grouponRulesMapper.updateByPrimaryKeySelective(grouponRules);
    }
}
