package com.fh.service.impl;

import com.fh.mapper.TypeMapper;
import com.fh.model.Type;
import com.fh.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Type> queryTypeList() {
        return typeMapper.queryTypeList();
    }
}
