package main.gof.creational.singleton;

/**
 * Created by zmax.
 */
public class SingletonOnDemand {
    private SingletonOnDemand(){}

    private static class LazySomethingHolder {
        public static SingletonOnDemand singletonInstance = new SingletonOnDemand();
    }

    public static SingletonOnDemand getInstance() {
        return LazySomethingHolder.singletonInstance;
    }
}
