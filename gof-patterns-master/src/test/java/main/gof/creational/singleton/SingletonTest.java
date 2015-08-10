package main.gof.creational.singleton;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SingletonTest {

    @Test
    public void singletonTest() {
        Singleton singletonBase1 = Singleton.getSingleton();
        Singleton singletonBase2 = Singleton.getSingleton();

        assertTrue(singletonBase1.equals(singletonBase2));

        System.out.println("singletonBase 1 = " + singletonBase1.toString());
        System.out.println("singletonBase 2 = " + singletonBase2.toString());
    }
}
