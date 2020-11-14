package com.fh.service.impl;

import com.fh.mapper.BabyMapper;
import com.fh.model.Baby;
import com.fh.vo.BabyVo;
import com.fh.service.BabyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class BabyServiceImpl implements BabyService {

    @Autowired
    private BabyMapper babyMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Baby> queryBabyList(BabyVo babyVo) {
        return babyMapper.queryBabyList(babyVo);
    }

    @Override
    public void addBaby(Baby baby) {
        babyMapper.addBaby(baby);
    }

    @Override
    public void updateBaby(Baby baby) {
        babyMapper.updateBaby(baby);
    }

    @Override
    public void deleteBatch(List<Integer> babyIds) {
        babyMapper.deleteBatch(babyIds);
    }

    @Override
    public void deleteBaby(Integer babyId) {
        babyMapper.deleteBaby(babyId);
    }
}
