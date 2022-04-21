package curs1;

import org.testng.annotations.Test;
@Test
public class TestNGTestAnotation {
    //@Test
    public void one(){
        System.out.println("One");
    }
    //@Test
    public void two(){
        System.out.println("Two");
    }
    //@Test
    public void three(){
        System.out.println("Three");
    }
    @Test
    private void four(){
        System.out.println("Four");
    }
    //@Test
    private void five(){
        System.out.println("Five");
    }
}
