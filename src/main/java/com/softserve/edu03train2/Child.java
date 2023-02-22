package com.softserve.edu03train2;


import com.softserve.edu03train.Parent;

public class Child extends Parent {

    //@Override
    public int f() {
        System.out.println("running f() from Child");
        return 2;
    }

    public int useF2() {
        //return useF();
		return f();
    }
}
