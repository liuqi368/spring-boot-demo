package com.example.controller;



/**
 * @author liuqi
 * @Title: Enum
 * @ProjectName alpay
 * @Description: TODO
 * @date 2019/6/2420:21
 * 使用的是enum关键字而不是class。
 *  多个枚举变量直接用逗号隔开。
    枚举变量最好大写，多个单词之间使用”_”隔开（比如：INT_SUM）。
    定义完所有的变量后，以分号结束，如果只有枚举变量，而没有自定义变量，分号可以省略。
    在其他类中使用enum变量的时候，只需要【类名.变量名】就可以了，和使用静态变量一样。
    这个类和我们定义的变量没啥区别，只是限制了我们传入参数的值。是为了保证安全。
 */
public enum  WeekdayController {

    //枚举变量一定要放置在第一行
    SUN(0),MON(1),TUS(2),WED(3),THU(4),FRI(5),SAT(6);

    private int value;

    //如果定义的变量后面需要带参数的话，需要定义一个私有属性，和一个私有的构造方法。public 是不能通过编译的。
    //这里的private 可写可不写，默认就是private
    private WeekdayController(int value){
        this.value=value;
    }
}
