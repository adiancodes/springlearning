package org.telusko;

public class Desktop implements Computer{
    @Override
    public void compile(){
        System.out.println("Compiling using Desktop");
    }

    public Desktop(){
        System.out.println(
                "desktop created"
        );
    }
}
