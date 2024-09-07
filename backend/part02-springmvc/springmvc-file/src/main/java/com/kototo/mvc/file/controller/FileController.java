package com.kototo.mvc.file.controller;

import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

@RestController
@RequestMapping("/save")
public class FileController {

    @Autowired
    private ServletContext application;

//    @PostMapping("/picture")
    public String fileUpload(String nickName,
                             MultipartFile headPicture,
                             MultipartFile backgroundheadPicture) throws IOException {
        System.out.println(nickName);

        String inputName = headPicture.getName();
        System.out.println("文件上传表单项的 name 属性值：" + inputName);

        // 获取这个数据通常都是为了获取文件本身的扩展名
        String originalFilename = headPicture.getOriginalFilename();
        System.out.println("文件在用户本地原始的文件名：" + originalFilename);

        String contentType = headPicture.getContentType();
        System.out.println("文件的内容类型：" + contentType);

        boolean empty = headPicture.isEmpty();
        System.out.println("文件是否为空：" + empty);

        long size = headPicture.getSize();
        System.out.println("文件大小：" + size);

        byte[] bytes = headPicture.getBytes();
        System.out.println("文件二进制数据的字节数组：" + Arrays.asList(bytes));

        InputStream inputStream = headPicture.getInputStream();
        System.out.println("读取文件数据的输入流对象：" + inputStream);

        Resource resource = headPicture.getResource();
        System.out.println("代表当前 MultiPartFile 对象的资源对象" + resource);
        return "ok";
    }

    @PostMapping("/picture")
    public String fileUpload1(String nickName,
                             MultipartFile headPicture,
                             MultipartFile backgroundPicture) throws IOException {

        String realPath = application.getRealPath("/images");

        String filename = headPicture.getOriginalFilename();
        String filename1 = backgroundPicture.getOriginalFilename();

        headPicture.transferTo(new File(realPath + File.separator + filename));
        backgroundPicture.transferTo(new File(realPath + File.separator +filename1));

        return "ok";
    }
}
