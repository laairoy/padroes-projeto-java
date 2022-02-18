package me.dio.gof.singleton;

/*
 * Singleton "preguiçoso".
 * @author Laairoy
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instance;
    }
}
