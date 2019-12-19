package com.example.design;

/**
 * @author liuqi
 * @Title: AmdMainboard
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/2/229:47
 */
public class AmdMainboard implements Mainboard{
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;
    /**
     * 构造方法，传入CPU插槽的孔数
     * @param cpuHoles
     */
    public AmdMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {

    }
}
