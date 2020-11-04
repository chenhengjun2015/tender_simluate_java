package com.design.tender.simple;

import com.design.tender.business.entity.SimluateTender;
import com.design.tender.business.mapper.SimluateTenderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {
    @Resource
    private SimluateTenderMapper simluateTenderMapper;

    @Test
    public void testSelect(){
        System.out.println("start select");
        List<SimluateTender> list = simluateTenderMapper.selectList(null);
        list.forEach(System.out::println);
    }
}
