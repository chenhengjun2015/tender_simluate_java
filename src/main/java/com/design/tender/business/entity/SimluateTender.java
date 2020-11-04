package com.design.tender.business.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author chj
 * @since 2020-11-04
 */
@Data
@Accessors(chain = true)
public class SimluateTender  {

    private static final long serialVersionUID = 1L;

    private Integer pid;

    /**
     * 模拟项目名称
     */
    private String projname;

    /**
     * 企业编号
     */
    private Integer enpid;

    /**
     * 企业名称
     */
    private String enpname;

    /**
     * 浮动率（模拟）
     */
    private String fluctuate1;

    /**
     * 浮动率（真实)
     */
    private String fluctuate2;


}
