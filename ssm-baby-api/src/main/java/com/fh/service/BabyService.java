package com.fh.service;

import com.fh.model.Baby;
import com.fh.vo.BabyVo;

import java.util.List;

public interface BabyService {
    List<Baby> queryBabyList(BabyVo babyVo);

    void addBaby(Baby baby);

    void updateBaby(Baby baby);

    void deleteBatch(List<Integer> babyIds);

    void deleteBaby(Integer babyId);
}
