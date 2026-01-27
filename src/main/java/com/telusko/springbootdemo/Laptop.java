package com.telusko.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
//    @Autowired
//    CPU cp;

    public void coding(){
        //cp.initialising();
        System.out.println("Laptop coding");
    }
}
