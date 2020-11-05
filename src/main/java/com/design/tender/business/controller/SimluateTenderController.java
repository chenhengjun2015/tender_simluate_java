package com.design.tender.business.controller;


import com.design.tender.business.entity.SimluateTender;
import com.design.tender.business.service.ISimluateTenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author chj
 * @since 2020-11-04
 */
@RestController
@RequestMapping("/business/simluate-tender")
public class SimluateTenderController  {

    @Autowired
    ISimluateTenderService simluateTenderService;

    @PostMapping("/queryAll")
    public List queryAll(){
        List<SimluateTender> list =simluateTenderService.list();
        list.forEach(System.out::println);
        return list;
    }
}
