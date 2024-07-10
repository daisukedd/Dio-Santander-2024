// Classe Singleton
public class Singleton {
    // Instância única privada estática
    private static Singleton instance;

    // Construtor privado para evitar instanciação externa
    private Singleton() {
        // Construtor privado para evitar instanciação externa
    }

    // Método estático para obter a instância única (lazy initialization)
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Métodos da instância
    public void showMessage() {
        System.out.println("Hello, Singleton!");
    }
}

// Exemplo de uso do Singleton
public class SingletonExample {
    public static void main(String[] args) {
        // Obtendo a instância do Singleton
        Singleton singleton = Singleton.getInstance();

        // Usando o objeto singleton
        singleton.showMessage();
    }
}
