package com.design.tender.business.entity;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author chj
 * @since 2020-11-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SimluateMain implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 模拟项目编号
     */
    @TableId(type = IdType.AUTO)
    private Integer pid;

    /**
     * 模拟项目名称
     */
    private String projname;

    /**
     * 最佳投标额
     */
    private String bestcaptial;


    // 该属性不为数据库表字段，但又是必须使用的
    @TableField(exist = false)
    private List<SimluateTender> simluateTenders;
}
