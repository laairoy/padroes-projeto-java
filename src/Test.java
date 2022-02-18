import me.dio.gof.facade.Facade;
import me.dio.gof.singleton.SingletonEager;
import me.dio.gof.singleton.SingletonLazy;
import me.dio.gof.singleton.SingletonLazyHolder;
import me.dio.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton
        SingletonLazy sl = SingletonLazy.getInstance();
        System.out.println(sl);
        sl = SingletonLazy.getInstance();
        System.out.println(sl);

        SingletonEager se = SingletonEager.getInstance();
        System.out.println(se);
        se = SingletonEager.getInstance();
        System.out.println(se);

        SingletonLazyHolder slh = SingletonLazyHolder.getInstance();
        System.out.println(slh);
        slh = SingletonLazyHolder.getInstance();
        System.out.println(slh);


        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Jose", "12345545");

    }
}
