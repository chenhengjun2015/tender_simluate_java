package com.design.tender.business.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.design.tender.business.entity.SimluateMain;

public interface INewSimluateMainService extends IService<SimluateMain> {

    boolean insert(SimluateMain simluateMain);
}
