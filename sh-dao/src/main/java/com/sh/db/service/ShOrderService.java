package com.sh.db.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.db.dao.OrderMapper;
import com.sh.db.dao.ShOrderMapper;
import com.sh.db.domain.ShOrder;

@Service
public class ShOrderService {
	
	@Autowired
	private ShOrderMapper shOrderMapper;
	
	@Autowired
	private OrderMapper orderMapper;

	public ShOrder findById(Integer orderId) {
        return shOrderMapper.selectByPrimaryKey(orderId);
    }
	
    public int updateWithOptimisticLocker(ShOrder order) {
        LocalDateTime preUpdateTime = order.getUpdateTime();
        order.setUpdateTime(LocalDateTime.now());
        return orderMapper.updateWithOptimisticLocker(preUpdateTime, order);
    }
}
