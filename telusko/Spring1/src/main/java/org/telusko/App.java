package org.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //two ways to create a spring contaioner IOC - inversion of control - which is responsible for creating/managing the lifecycle of objects
        // one is beanfactory() old one and another is ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates a container

        //here "alien" will correspond to the bean tag in xml file
       // Alien obj = (Alien)context.getBean("alien");//get bean will give me type of object so we are type casting it
//        Alien  obj = new Alien();

        //to talk to spring we use xml , java based files and annotations , here we are using xml (not a big fan)
        //create a resources folder
        //it should be in main folder
        //and we have to mention the name of xml file in classPathApplicationContext

//        System.out.println( "Hello World!" );
//        System.out.println(obj.age);
//        obj.code();

        //-----------------SCOPES--------------
        // we have different scopes
        // singleton
        // prototype
        // request
        //session
        //in spring we use singleton and prototype
        //request and session is for web
        //by default we follow single ton
        //so we used bean once in xml so we will have only one object created
        //what if we want two objects like everytime we do get bean we
        //want a new object
        //for that we need to change
        //something and that something is a scope
        //in the bean there is one more attribute which is called scope
        //we will do something called protorype it will create a new object everytime
        //getBean is run
        //singleton object is created when the container is loading while prototype is created whenever getBean is called

//        Alien obj2 = (Alien) context.getBean("alien");
//        obj2.age = 9;
//
//        System.out.println(obj2.age);
//        System.out.println(obj.age);
        //so both are referring to same object as we have only one bean in xml file
//
//        obj2.code();
        //
         // --------INJECTION TECHniQUES----------
        //SETTER INJECTION
//        Alien obj = (Alien)context.getBean("alien");
        //we can typecast of type for this object
        Alien obj = context.getBean("alien" , Alien.class);
        //i also dont need to specify the name of the bean it will automatically search by class

        //obj.setAge(30);
        System.out.println(obj.getAge());
        //how will i inject the value, with the help of spring framework
        //we can do so by going into the xml file and changeing in bean tag of alien class
        //other than doing obj.setAge() or inserting value in Alien class
        //we can use a <property name = "Age" value = "21"> in the bean tag of xml file
        obj.code();
        //

        //---------------------REF ATTRIBUTE--------------------
        //what if the attribute is not a primitive variable what if its an object then how will i inject it?
        //so instead of using val in property tag we will use ref as we are creating an object
        //
         // ---------------------- CONSTRUCTOR INJECTION ---------------------------------
        //injected using the constructor tag
        //can have many properties see the xml file

        // ----------------------- AUTOWIRE -----------------------------------------------
        // can we used to link objects created with each other ByNAME and ByType
        //

        //------------------------LAZY INITIALISATION OF A BEAN ----------------------------
        //so far we have two 3 beans in xml one for alien , then laptop and then desktop
        //whenever we dont mention scope bydefault the scope is singleton
        //which means in total we will get only one object and that too when my container load and all objects at once
        //so by default all the objects are singleton
        //so when the classpathapplicationcontext gets called all the objects are created
        //but we are using only two objects alien and laptop but spring also created desktop
        //so we want to create desktop object only when it is needed not everytime
        //to achieve that we just have to write two words
        //in the bean definiton in the xml file lazy-init="true"
        //when the non-lazy bean needs a lazy bean we even though lazy bean is created

        //we can also make a bean inner by putting bean tag inside property so that it will only be available for that particular object 

    }
}
