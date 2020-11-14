package com.fh.controller;

import com.fh.common.ServerResponse;
import com.fh.model.Baby;
import com.fh.vo.BabyVo;
import com.fh.service.BabyService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("babyController")
public class BabyController {

    @Autowired
    private BabyService babyService;

    @RequestMapping("queryBabyList")
    public PageInfo queryBabyList(BabyVo babyVo){
        PageHelper.startPage(babyVo.getPageNum(),babyVo.getPageSize());
        List<Baby> babyList = babyService.queryBabyList(babyVo);
        PageInfo pageInfo = new PageInfo(babyList);
        return pageInfo;
    }

    @RequestMapping("addBaby")
    public ServerResponse addBaby(Baby baby){
        try {
            babyService.addBaby(baby);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    @RequestMapping("updateBaby")
    private ServerResponse updateBaby(Baby baby){
        try {
            babyService.updateBaby(baby);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    @RequestMapping("deleteBatch")
    public ServerResponse deleteBatch(@RequestParam("babyIds") List<Integer> babyIds){
        try {
            babyService.deleteBatch(babyIds);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    @RequestMapping("deleteBaby")
    public ServerResponse deleteBaby(Integer babyId){
        try {
            babyService.deleteBaby(babyId);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

}
