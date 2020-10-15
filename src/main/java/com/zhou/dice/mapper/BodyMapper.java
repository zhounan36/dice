package com.zhou.dice.mapper;

import com.zhou.dice.entity.Body;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhounan
 * @since 2020-10-12
 */

@Mapper
@Repository
public interface BodyMapper extends BaseMapper<Body> {

}
