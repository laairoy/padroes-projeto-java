package me.dio.gof.singleton;

/*
 * Singleton "preguiçoso".
 * @author Laairoy
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){

        if(instance == null) instance = new SingletonLazy();

        return instance;
    }
}
