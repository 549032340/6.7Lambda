package com.example;

/**
 * Created by qiuzhanghua on 2017/2/6.
 */
@FunctionalInterface
public interface Integrable {
  double eval(double x);//通过计算 string 得到的值 ,通俗点就是把String类型的"1"变成int 型的1
}
