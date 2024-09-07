package com.kototo.mvc.param.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cookie")
public class CookieController {

    @GetMapping("/ck")
    @ResponseBody
    public String getSessionId(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println("sessionId = " + sessionId);
        return "sessionId";
    }

    @GetMapping("/ses")
    @ResponseBody
    public String getSession(HttpSession httpSession) {
        System.out.println("httpSession = " + httpSession.getId());
        return "session";
    }

}
