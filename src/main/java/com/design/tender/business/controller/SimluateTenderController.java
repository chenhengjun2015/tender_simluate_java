package com.design.tender.business.controller;


import com.design.tender.business.entity.SimluateMain;
import com.design.tender.business.entity.SimluateTender;
import com.design.tender.business.service.INewSimluateMainService;
import com.design.tender.business.service.ISimluateTenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@CrossOrigin(origins = "*",
        maxAge = 3600,
        methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/business/simluate-tender")
public class SimluateTenderController  {

    @Autowired
    ISimluateTenderService simluateTenderService;

    @Autowired
    INewSimluateMainService newSimluateMainService;

    @RequestMapping(value = "/queryAll",method =RequestMethod.POST)
    public List queryAll(){
        List<SimluateTender> list =simluateTenderService.list();
        list.forEach(System.out::println);
        return list;
    }

    @RequestMapping(value = "/save",method =RequestMethod.POST)
    public boolean saveSimluate(@RequestBody SimluateMain simluateMain){
        newSimluateMainService.insert(simluateMain);
        return true;
    }
}
