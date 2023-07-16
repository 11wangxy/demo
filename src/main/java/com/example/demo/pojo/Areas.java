package com.example.demo.pojo;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author: Wang Xiaoyi
 * @date: 2023-07-15 23:37
 * @description: demo
 */
@Data
@Accessors(chain = true)
@Builder
@TableName(value = "[dbo.areas]")
public class Areas {
    private String id;
    private String areaId;
    private String area;
    private String cityId;
}
