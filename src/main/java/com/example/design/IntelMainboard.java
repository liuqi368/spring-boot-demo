package com.example.design;

/**
 * @author liuqi
 * @Title: IntelMainboard
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/2/229:46
 */
public class IntelMainboard implements Mainboard{
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;
    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles
     */
    public IntelMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {

    }
}
