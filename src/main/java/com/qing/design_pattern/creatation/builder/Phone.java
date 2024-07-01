package com.qing.design_pattern.creatation.builder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    //cpu
    private String cpu;

    //内存
    private String mem;

    //硬盘
    private String disk;

    //相机像素
    private String camera;
}
