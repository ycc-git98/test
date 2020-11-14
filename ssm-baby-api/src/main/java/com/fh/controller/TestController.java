package com.fh.controller;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("testApi")
@RestController
public class TestController {

    @RequestMapping("yucongcong")
    public void yucongcong(@RequestBody JSONObject json, HttpServletRequest request){
        String name = request.getHeader("name");
        System.out.println(name);
        System.out.println(json.toString());
    }

}
