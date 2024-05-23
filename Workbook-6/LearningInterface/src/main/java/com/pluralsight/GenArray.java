package com.pluralsight;

public class GenArray <T extends Number> {
    T obj;
    T arr[];

    public GenArray(T o, T[] vals){
        this.obj=o;
        System.out.println("Value: "+obj);
        arr=vals;
    }
}
