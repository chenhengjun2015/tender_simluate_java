package com.design.tender.business.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.design.tender.business.entity.SimluateMain;
import com.design.tender.business.entity.SimluateTender;
import com.design.tender.business.mapper.SimluateMainMapper;
import com.design.tender.business.mapper.SimluateTenderMapper;
import com.design.tender.business.service.INewSimluateMainService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class NewSimluateMainServiceImpl extends ServiceImpl<SimluateMainMapper, SimluateMain> implements INewSimluateMainService {

    @Resource
    private SimluateMainMapper simluateMainMapper;

    @Resource
    private SimluateTenderMapper simluateTenderMapper;


    /**
     * 重写 IService中 boolean insert(T var1);
     * 重写的插入方法实现了事务管理，当子表插入失败，主表已经插入的数据会回滚
     * @param simluateMain
     * @return
     */
    public boolean insert(SimluateMain simluateMain){
        try {
            simluateMainMapper.insert(simluateMain);
            List<SimluateTender> simluateTenders=simluateMain.getSimluateTenders();
            for (SimluateTender simluateTender:simluateTenders) {
                simluateTender.setPid(simluateMain.getPid());
                simluateTenderMapper.insert(simluateTender);
            }
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
