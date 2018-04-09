package com.manage.dao;

import com.manage.model.Person;
import org.apache.ibatis.annotations.*;

public interface PersonMapper {

    Person select(@Param("name") String name, @Param("age") int age);

}