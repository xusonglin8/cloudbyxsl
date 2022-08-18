package com.atxsl.springcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xusonglin
 * @date 2020/10/4 - 19:12
 */
@Controller
public class indexController {
    @RequestMapping(value = "/")
    public String index(){

        return "vue案例";
    }
}
