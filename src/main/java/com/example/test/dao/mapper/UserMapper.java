package com.example.test.dao.mapper;

import com.example.test.dao.BaseMapper;
import com.example.test.dao.data.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper extends BaseMapper<UserDO> {
}
