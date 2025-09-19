package com.driver;

public class A {
    public String meth() {
        return "Invoking method from class A";
    }
}
class B extends  A{
    @Override
    public String meth() {
        return "Method is Overridden in Extended class B";
    }

    //    public String meth(){
//
//        return "Method is overridden in Extended class B";
//    }
}