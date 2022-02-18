package me.dio.gof.singleton;

/*
 * Singleton "Apressado".
 * @author Laairoy
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){
        return instance;
    }
}
