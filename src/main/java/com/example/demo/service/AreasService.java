package com.example.demo.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.pojo.Areas;


/**
 * @author: Wang Xiaoyi
 * @date: 2023-07-15 23:39
 * @description: demo
 */
public interface AreasService extends IService<Areas> {
    public Areas show(Integer id);
}
