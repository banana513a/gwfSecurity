package com.gwf.service.impl;

import com.gwf.dao.BBlogMapper;
import com.gwf.model.BBlog;
import com.gwf.service.BBlogService;
import com.gwf.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/11/25.
 */
@Service
@Transactional
public class BBlogServiceImpl extends AbstractService<BBlog> implements BBlogService {
    @Resource
    private BBlogMapper bBlogMapper;

}