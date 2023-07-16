package com.example.demo;

import com.example.demo.pojo.Areas;
import com.example.demo.service.AreasService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    private AreasService AreasService;

    @Test
    void contextLoads() {
        Areas show = AreasService.show(100);
        System.out.println(show);
    }
}
