package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Baby;
import com.fh.vo.BabyVo;

import java.util.List;

public interface BabyMapper extends BaseMapper<Baby> {
    List<Baby> queryBabyList(BabyVo babyVo);

    void addBaby(Baby baby);

    void updateBaby(Baby baby);

    void deleteBatch(List<Integer> babyIds);

    void deleteBaby(Integer babyId);
}
