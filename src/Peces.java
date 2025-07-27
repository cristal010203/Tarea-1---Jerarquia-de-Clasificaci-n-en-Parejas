public class Peces {

    static int cantidadOjos;
    static int cantidadAletas;
    static boolean tieneHuesos;
    static boolean tieneEscamas;
    static boolean tieneBranquias;
    static boolean tieneLengua;
    static boolean tieneNariz;
    static boolean tieneDientes;

    static String tipoAlimentacion = "Omnívoros, carnívoros, filtradores";
    static String tipoSangre = "Sangre fría";
    static String habitadNatural = "Ríos, lagos, mares, océanos";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Ovíparos (algunos vivíparos)");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Branquial");
    }

    public static void mostrarPez() {
        System.out.println("\n🐠 Pez detectado:");
        System.out.println("- Ojos: " + cantidadOjos);
        System.out.println("- Aletas: " + cantidadAletas);
        System.out.println("- Huesos: " + tieneHuesos);
        System.out.println("- Escamas: " + tieneEscamas);
        System.out.println("- Branquias: " + tieneBranquias);
        System.out.println("- Lengua: " + tieneLengua);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Dientes: " + tieneDientes);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}