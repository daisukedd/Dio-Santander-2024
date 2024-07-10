public class Main {
    private static final String BOOTCAMP_NOME = "Bootcamp de Desenvolvimento";

    public static void main(String[] args) {
        Bootcamp bootcamp = criarBootcamp();

        mostrarDetalhesDoBootcamp(bootcamp);
    }

    private static Bootcamp criarBootcamp() {
        Bootcamp bootcamp = new Bootcamp(BOOTCAMP_NOME);

        adicionarCursosAoBootcamp(bootcamp);
        adicionarMentoriasAoBootcamp(bootcamp);
        adicionarDevsAoBootcamp(bootcamp);

        return bootcamp;
    }

    private static void adicionarCursosAoBootcamp(Bootcamp bootcamp) {
        bootcamp.adicionarCurso(new Curso("Java para Iniciantes", 40));
        bootcamp.adicionarCurso(new Curso("Python Avançado", 60));
    }

    private static void adicionarMentoriasAoBootcamp(Bootcamp bootcamp) {
        bootcamp.adicionarMentoria(new Mentoria("Construção de Carreira", "Segunda-feira às 14:00"));
        bootcamp.adicionarMentoria(new Mentoria("Arquitetura de Software", "Quarta-feira às 16:00"));
    }

    private static void adicionarDevsAoBootcamp(Bootcamp bootcamp) {
        bootcamp.adicionarDev(new Dev("João", "Desenvolvimento Web"));
        bootcamp.adicionarDev(new Dev("Maria", "Ciência de Dados"));
    }

    private static void mostrarDetalhesDoBootcamp(Bootcamp bootcamp) {
        System.out.println("Bem-vindo ao Bootcamp: " + bootcamp.getNome());
        mostrarCursos(bootcamp);
        mostrarMentorias(bootcamp);
        mostrarDevs(bootcamp);
    }

    private static void mostrarCursos(Bootcamp bootcamp) {
        System.out.println("\nCursos oferecidos:");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println("- " + curso.getNome() + " (" + curso.getCargaHoraria() + " horas)");
        }
    }

    private static void mostrarMentorias(Bootcamp bootcamp) {
        System.out.println("\nMentorias disponíveis:");
        for (Mentoria mentoria : bootcamp.getMentorias()) {
            System.out.println("- " + mentoria.getTema() + " (" + mentoria.getHorario() + ")");
        }
    }

    private static void mostrarDevs(Bootcamp bootcamp) {
        System.out.println("\nDevs participantes:");
        for (Dev dev : bootcamp.getDevs()) {
            System.out.println("- " + dev.getNome() + " (" + dev.getEspecialidade() + ")");
        }
    }
}
