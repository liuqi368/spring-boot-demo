package com.example.design;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/**
 * @author liuqi
 * @Title: AbstractFactory
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/2/229:49
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    public Cpu createCpu();

    /**
     * 创建主板对象
     * @return 主板对象
     */
    public Mainboard createMainboard();
}
