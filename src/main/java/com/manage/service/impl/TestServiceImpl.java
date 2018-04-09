package com.manage.service.impl;


import com.manage.dao.PersonMapper;
import com.manage.model.Person;
import com.manage.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XRog
 * On 2/1/2017.12:58 AM
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private PersonMapper personMapper;

    public Person login(String name, int age) {
        return personMapper.select(name,age);
    }
}