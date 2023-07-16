package com.example.demo.service.serviceImpl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.mapper.AreasMapper;
import com.example.demo.pojo.Areas;

import com.example.demo.service.AreasService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Wang Xiaoyi
 * @date: 2023-07-15 23:41
 * @description: demo
 */
@Service
public class AreasServiceImpl extends ServiceImpl<AreasMapper, Areas> implements AreasService {
    @Resource
    private AreasMapper areasMapper;
    @Override
    public Areas show(Integer id){
        return areasMapper.selectById(id);
    }
}
