package com.driver;

 class A {
     String meth() {
        return "Invoking method from class A";
    }
 }

class B extends  A{
    @Override
    String meth() {
        return "Method is Overridden in Extended class B";
    }

}
