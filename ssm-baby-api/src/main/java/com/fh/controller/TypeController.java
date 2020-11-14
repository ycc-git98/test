package com.fh.controller;

import com.fh.common.ServerResponse;
import com.fh.model.Type;
import com.fh.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("typeController")
public class TypeController {

    @Autowired
    private TypeService typeService;

    @RequestMapping("queryTypeList")
    public ServerResponse queryTypeList(){
        try {
            List<Type> typeList = typeService.queryTypeList();
            return ServerResponse.success(typeList);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

}
