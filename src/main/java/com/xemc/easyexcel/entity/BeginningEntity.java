package com.xemc.easyexcel.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

/**
 * @title: BeginningEntity
 * @Author ZhangZw
 * @Date: 2022/4/27 09:38
 * @Version 1.0
 * 期初vo
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@TableName("easyexcel")
public class BeginningEntity {
    private String code;
    private String name;
}
