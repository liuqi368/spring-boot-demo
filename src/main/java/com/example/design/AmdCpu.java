package com.example.design;

/**
 * @author liuqi
 * @Title: AmdCpu
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/2/229:44
 */
public class AmdCpu implements Cpu{
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  AmdCpu(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {

    }
}
