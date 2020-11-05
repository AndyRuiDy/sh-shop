package com.sh.db.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.db.dao.ShGrouponMapper;
import com.sh.db.domain.ShGroupon;
import com.sh.db.domain.ShGrouponExample;

@Service
public class ShGrouponService {

	@Autowired
	private ShGrouponMapper grouponMapper;
	
	public List<ShGroupon> queryByRuleId(int grouponRuleId) {
        ShGrouponExample example = new ShGrouponExample();
        example.or().andRulesIdEqualTo(grouponRuleId).andDeletedEqualTo(false);
        return grouponMapper.selectByExample(example);
    }
	
	public int updateById(ShGroupon groupon) {
        groupon.setUpdateTime(LocalDateTime.now());
        return grouponMapper.updateByPrimaryKeySelective(groupon);
    }
}
