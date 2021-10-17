package com.chz;

import com.chz.mapper.BorrowerMapper;
import com.chz.mapper.EquipMapper;
import com.chz.mapper.UserMapper;
import com.chz.pojo.Borrower;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Springboot01EasyEquipManagementApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Autowired
    BorrowerMapper borrowerMapper;
    @Autowired
    EquipMapper equipMapper;

    @Test
    void contextLoads(){
        System.out.println(userMapper.UserList());
    }

}
