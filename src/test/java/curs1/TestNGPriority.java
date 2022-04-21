package curs1;

import org.testng.annotations.Test;

public class TestNGPriority {
    @Test(priority = 0)
    public void one(){
        System.out.println("One");
    }
    @Test(priority = 1)
    public void two(){
        System.out.println("Two");
    }
    @Test(priority = 2)
    public void three(){
        System.out.println("Three");
    }
    @Test(priority = 3)
    public void four(){
        System.out.println("Four");
    }
    @Test(priority = 4)
    public void five(){
        System.out.println("Five");
    }
}
