package curs1;

import org.testng.annotations.Test;
import static org.junit.Assert.assertTrue;

public class TestNGDependency {
    @Test
    public void method1(){
        assertTrue(false);
        System.out.println("Unu");
    }
    @Test
    public void method2(){
        System.out.println("Two");
    }
    @Test
    public void method3(){
        System.out.println("Three");
    }


}
