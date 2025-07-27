public class Moluscos {

    static int cantidadOjos;
    static int cantidadPatas;
    static boolean tieneConcha;
    static boolean tieneTentaculos;
    static boolean tieneRadula;
    static boolean tieneLengua;
    static boolean tieneNariz;

    static String tipoAlimentacion = "Herbívoros, carnívoros, filtradores";
    static String tipoSangre = "Abierta (la mayoría)";
    static String habitadNatural = "Océanos, mares, lagos, ríos, tierra húmeda";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Ovíparos");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Branquial o pulmonar");
    }

    public static void mostrarMolusco() {
        System.out.println("\n🐚 Molusco detectado:");
        System.out.println("- Ojos: " + cantidadOjos);
        System.out.println("- Patas: " + cantidadPatas);
        System.out.println("- Concha: " + tieneConcha);
        System.out.println("- Tentáculos: " + tieneTentaculos);
        System.out.println("- Rádula: " + tieneRadula);
        System.out.println("- Lengua: " + tieneLengua);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}