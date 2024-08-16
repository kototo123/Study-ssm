package com.kototo.mvc.resp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/resp")
public class RespController {

    @GetMapping("/index")
    public String toIndex(HttpServletRequest request) {
        request.setAttribute("msg","你好啊我爱你!");
        return "index";
    }

    @GetMapping("/jump")
    public String jump(HttpServletRequest request) {
        request.setAttribute("帅哥","我不是英雄 只是个--拿锤子的---~~~");
//        return "forward:/resp/forward";
        return "redirect:/resp/redirect";
    }

    @GetMapping(value = "/forward",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String toForward(HttpServletRequest request) {
        System.out.println("转发");
        String msg = (String) request.getAttribute("帅哥");
        return msg;
    }

    @GetMapping(value = "/redirect",produces = "text/plain;charset=utf-8")
    @ResponseBody
    public String toRedirect(HttpServletRequest request) {
        System.out.println("重定向");
        String msg = (String) request.getAttribute("帅哥");
        return msg;
    }
}
