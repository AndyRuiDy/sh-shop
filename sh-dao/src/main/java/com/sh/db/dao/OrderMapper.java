package com.sh.db.dao;

import java.time.LocalDateTime;

import org.apache.ibatis.annotations.Param;

import com.sh.db.domain.ShOrder;

public interface OrderMapper {
    int updateWithOptimisticLocker(@Param("lastUpdateTime") LocalDateTime lastUpdateTime, @Param("order") ShOrder order);
}