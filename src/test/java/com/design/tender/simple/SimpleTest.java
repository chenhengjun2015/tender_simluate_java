package com.design.tender.simple;

import com.design.tender.business.entity.SimluateMain;
import com.design.tender.business.entity.SimluateTender;
import com.design.tender.business.mapper.SimluateTenderMapper;
import com.design.tender.business.service.impl.NewSimluateMainServiceImpl;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {
    @Resource
    private SimluateTenderMapper simluateTenderMapper;

    @Autowired
    private NewSimluateMainServiceImpl newSimluateMainService;
    @Test
    public void testSelect(){
        System.out.println("start select");
        List<SimluateTender> list = simluateTenderMapper.selectList(null);
        list.forEach(System.out::println);
    }

    @Test
    public void testMulityInsert(){
        SimluateMain simluateMain = new SimluateMain();
        simluateMain.setProjname("ce");
        simluateMain.setBestcaptial("90");
        SimluateTender simluateTender = new SimluateTender();
        simluateTender.setEnpid(0);
        simluateTender.setEnpname("ces");
        simluateTender.setFluctuate1("10");
        SimluateTender simluateTender2 = new SimluateTender();
        simluateTender2.setEnpid(0);
        simluateTender2.setEnpname("ces");
        simluateTender2.setFluctuate1("10");
        List<SimluateTender> list = new ArrayList<>();
        list.add(simluateTender);
        list.add(simluateTender2);
        simluateMain.setSimluateTenders(list);
        newSimluateMainService.insert(simluateMain);
    }
}
