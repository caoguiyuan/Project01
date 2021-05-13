package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

//ctrl+shift+x:打开文件所在硬盘的在位置
//ctrl+shift+q:快速定位错误位置
public class HelloWorld extends Peson {
    private static final int INITIAL_SIZE = 10; //转化大小写：ctrl+shift+y
    //查看类的结构继承图：ctrl+shift+u
    private static ArrayList list;
    //生成构造器：alt+shift+s

    public HelloWorld() {
    }

    //收起所有方法：alt+shift+c
    //打开所有方法：alt+shift+x
    public static void main(String[] args) {
        System.out.println("HelloWorld!!!!");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.test();
        helloWorld.test1();
    }

    public void test() {
        //region Description
        System.out.println(21);
        //endregion
    }

    //提取方法(选择要抽取出来的代码)：ctrl+shift+m
    public void getlist(int aa) {
        Integer age1 = 18;
        Integer age2 = 18;
        Integer age3 = 18;
        System.out.println("aa = " + aa); //soutp
        System.out.println("HelloWorld.getlist"); //soutm
        System.out.println("age1 = " + age1);//soutv
        System.out.println(age3);
        Date date = new Date();//alt+enter：万能解错和生成返回值变量
        test1();
    }

    public static String test1() {
        //格式化代码快捷键：Ctrl+alt+L
        list = new ArrayList();   //把局员变量改为成员变量：alt+shift+f
        System.out.println("asa");
        return "";
    }

    public String method() {
        //生成try-catch,if-else等方法：alt+shift+z
        int aa = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream("hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
    //老狗
}
