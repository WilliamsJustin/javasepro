package com.xiaobai.variable;

public class VariableDemo2 {
    public static void main(String[] args) {
//        目标：理解变量使用的注意事项
//        1.变量要先声明再使用
        int a = 23;
        System.out.println(a);

//        2.变量声明后，不能存储其他类型的数据
//        a = 1.5;

//        3.变量的有效范围是从定义开始到"}"截至，且在同一个范围内都不能定义2个同名的变量
        {
            int b =25;
            System.out.println(b);
//            int b =100;  报错
        }
//        System.out.println(b);
        System.out.println(a);
//        int a =234;
        a = 200;//这里不是定义，是赋值

//        4.变量定义的时候可以没有初始值，但是使用的时候必须给初始值
        int c;
        c =12;
        System.out.println(c);
    }
}
