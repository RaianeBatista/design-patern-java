package onde.digitalinovation.gof.singleton;
/*
Singleton "apressado"
@author RaianeBatista


*/
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager (); // Instancia direto

    private SingletonEager () {
        super();
    }

    public static SingletonEager  getInstancia() {
        return instancia;
    }
}

