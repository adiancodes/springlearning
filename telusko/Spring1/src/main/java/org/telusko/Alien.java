package org.telusko;

public class Alien {
    private int age ;
    private Computer com; // we used bean id = "lap1" in the xml file for object creating by spring
    //public Computer desk;
    public Alien() {
        System.out.println("Object Created");
    }
    //parameterised constructor

    public Alien(int age) {
        this.age = age;
        System.out.println("Constructor is getting called");
    }

    public Alien (int age, Computer com) {
        this.age = age;
        this.com = com;
      //  this.desk = desk;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;

    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("I am coding");
        com.compile(); // i am referring to laptop here this com.compile
        //desk.compile();
    }
}
