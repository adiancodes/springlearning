package com.telusko.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //making this class as a component the spring knows that you want spring to manage this class
public class Alien {
    //creating a laptop object , we dont wanna use the new keyword

 //  Laptop laptop = new Laptop(); this complies as we are using new keyword
//Laptop laptop = context.
    //this will not work because we have not mentioned in the alien class that laptop will be coming from the spring framework
    //to connect this we have a concept of wiring
    //so just by using @AUtowired we are creating a wiring between laptop and alien so that we dont have to do ApplicationCOntext context again
    @Autowired
    Laptop lap;
    @Autowired
    CPU cp;
    //so spring framework knows to search in the container that it has to find an opject of laptop
    public void code(){
        lap.coding();
        cp.initialising();
        System.out.println("Coding");
    }
}
