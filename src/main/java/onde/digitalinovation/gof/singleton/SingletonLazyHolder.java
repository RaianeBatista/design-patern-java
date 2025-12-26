package onde.digitalinovation.gof.singleton;

/*
Singleton "Lazy Holder"
@see <a href="https://stackoverflow.com/a/24018148"> Referencia </a>
@author RaianeBatista


*/
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder(); // Instancia direto
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {

        return InstanceHolder.instancia;
    }
}

