package com.atguigu.java;

import java.util.ArrayList;

public class sda {
//    private static final  //prsf
//    public static final int //psfi
    public static void main(String[] args) {
//        getName();
        sda sda=new sda();
        sda.test(12);

    }

    public static void getName() {
        String[] list=new String[]{"test","name","age"};
        //fori
        System.out.println("快捷键:fori");
        for (int i = 0; i < list.length; i++) {
            System.out.println("list = " +list[i]);
        }
        //iter
        System.out.println("快捷键:iter");
        for (String s : list) {
            System.out.println("list = " + s);
        }

        //itar
        System.out.println("快捷键:itar");
        for (int i = 0; i < list.length; i++) {
            String s = list[i];
            System.out.println("list = " + s);
        }
    }


    public void test(int age){
        //soutp
        System.out.println("age = " + age);
        //生成list集合的for循环
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //list.for
        for (Object o : list) {
            System.out.println("o = " + o);
        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.fori = " + list.get(i));
        }
        System.out.println("");
        //list.forr,倒叙
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println("list.forr = " + list.get(i));
        }

        //ifn、inn、xxx.nn和xxx.null
        //ifn和xxx.null
        if (list == null) { }
        //inn和xxx.nn
        if (list != null) { }
    }
}
