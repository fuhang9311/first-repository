package com.fuhang.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.fuhang.reflect.Person");
            c.newInstance();
            Person p0 = (Person) c.newInstance();
            Field[] fields = c.getDeclaredFields();
            for (Field f : fields) {
                System.out.println(f.getName());
                f.setAccessible(true);
                String fieldName = (String) f.get(p0);
                System.out.println("fieldName:" + fieldName);
                f.set(p0, "付杭");
            }
            System.out.println("p0:" + p0);


            Constructor constructor = c.getConstructor(String.class);

            System.out.println(c.getName());
            Person p = (Person) constructor.newInstance("李四");
            System.out.println(p.getName());
            Method m = c.getMethod("setName", String.class);
            m.invoke(p, "张三");
            System.out.println(p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
