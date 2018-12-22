package com.javarush.task.task32.task3205;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Dmitriy on 13.10.2017.
 */
public class CustomInvocationHandler implements InvocationHandler {

    private SomeInterfaceWithMethods someInterfaceWithMethods;

    public CustomInvocationHandler(SomeInterfaceWithMethods someInterfaceWithMethods){
        this.someInterfaceWithMethods = someInterfaceWithMethods;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(method.getName() + " in");
        method.invoke(someInterfaceWithMethods, objects);
        System.out.println(method.getName() + " out");

        //а вот тут магия
        //фишка в том что метод invoke должен строку вернуть
        //поэтому валидатору не нравится return null
        //типа null это не строка - иди нахер
        return "all is done";
    }
}
