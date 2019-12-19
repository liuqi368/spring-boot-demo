package com.example.design;

/**
 * @author liuqi
 * @Title: AmdFactory
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/2/229:53
 */
public class AmdFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(938);
    }
}
