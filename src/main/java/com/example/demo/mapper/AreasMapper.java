package com.example.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.pojo.Areas;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author: Wang Xiaoyi
 * @date: 2023-07-15 23:37
 * @description: demo
 */
@Mapper
public interface AreasMapper extends BaseMapper<Areas> {
}
