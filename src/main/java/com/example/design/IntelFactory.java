package com.example.design;

/**
 * @author liuqi
 * @Title: IntelFactory
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/2/229:50
 */
public class IntelFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(755);
    }
}
