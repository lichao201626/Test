package com.file;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Test2{

    public static void main(String []args) throws Exception{

        List<Object> list=new ArrayList<>();
        Object o;

        //向list中添加Integer类型的数据
        Integer integer=1;
        o=integer;
        Test.addObjectToList(list, o);

        //向list中添加String类型的数据
        String string="Hello World";
        o=string;
        Test.addObjectToList(list, o);

        //向list中添加Character类型的数据
        Character character='c';
        o=character;
        Test.addObjectToList(list, o);

        //向list中添加Boolean类型的数据
        Boolean boolean1=true;
        o=boolean1;
        Test.addObjectToList(list, o);

        System.out.println(list);
        for (Object i : list) {
            System.out.println(i.getClass());
            System.out.println(i);
        }
    }

    public static List<Integer> addObjectToList(List<Integer> list, Object o) throws Exception{

        Class class1=list.getClass();
        Method method=class1.getMethod("add", Object.class);
        method.invoke(list, o);
        return list;
    }

}