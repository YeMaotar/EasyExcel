package com.xemc.easyexcel.controller;

import com.alibaba.excel.EasyExcel;
import com.xemc.easyexcel.entity.BeginningEntity;
import com.xemc.easyexcel.listener.UploadBeginningListener;
import com.xemc.easyexcel.service.BeginningService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @title: EasyExcelContorller
 * @Author ZhangZw
 * @Date: 2022/4/27 09:26
 * @Version 1.0
 */
@RestController
public class EasyExcelContorller {
    @Resource
    private BeginningService service;
    /**
     * 文件上传
     * <p>
     * 1. 创建excel对应的实体对象
     * <p>
     * 2. 由于默认一行行的读取excel，所以需要创建excel一行一行的回调监听器，参照{@link UploadBeginningListener}
     * <p>
     * 3. 直接读即可
     */
    @PostMapping("upload")
    public String upload(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), BeginningEntity.class, new UploadBeginningListener(service)).sheet().doRead();
        return "success";
    }
}
