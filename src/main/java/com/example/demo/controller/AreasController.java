package com.example.demo.controller;

import com.example.demo.pojo.Areas;
import com.example.demo.service.AreasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Wang Xiaoyi
 * @date: 2023-07-16 12:52
 * @description: demo
 */
@RestController
@RequestMapping("/areas")
public class AreasController {
    @Resource
    private AreasService areasService;

    @GetMapping("/{id}")
    public Areas selectById(@PathVariable Integer id){
        Areas show = areasService.show(id);
        return show;
    }
}
