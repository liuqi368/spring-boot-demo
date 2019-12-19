package com.example.design;

/**
 * @author liuqi
 * @Title: IntelCpu
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/2/229:43
 */
public class IntelCpu implements Cpu{
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  IntelCpu(int pins){
        this.pins = pins;
    }

    @Override
    public void calculate() {

    }
}
