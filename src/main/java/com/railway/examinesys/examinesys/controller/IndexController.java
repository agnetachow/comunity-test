package com.railway.examinesys.examinesys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Agneta
 */
@Controller
public class IndexController {
    //表示访问根目录，同时当没有任何参数的时候默认处理响应的方法
    @GetMapping("/")
    public String index(){

        return "index";
    }
}
