package singleton;

public class SingletonExample {

    public static void main(String[] args) {
        // Obtendo a instância do Singleton
        Singleton singleton = Singleton.getInstance();

        // Usando o objeto singleton
        singleton.showMessage();
    }
}
