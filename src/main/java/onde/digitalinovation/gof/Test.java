package onde.digitalinovation.gof;

import onde.digitalinovation.gof.singleton.SingletonEager;
import onde.digitalinovation.gof.singleton.SingletonLazy;
import onde.digitalinovation.gof.singleton.SingletonLazyHolder;

public class Test {
    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton :
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("==========================");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("=============================");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);



    }
}
