package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Type;

import java.util.List;

public interface TypeMapper extends BaseMapper<Type> {
    List<Type> queryTypeList();
}
