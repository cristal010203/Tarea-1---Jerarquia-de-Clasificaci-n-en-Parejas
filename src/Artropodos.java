public class Artropodos {

    static int cantidadOjos;
    static int cantidadPatas;
    static boolean tieneExoesqueleto;
    static boolean tieneAntenas;
    static boolean tieneAlas;
    static boolean tienePinzas;
    static boolean tieneLengua;
    static boolean tieneNariz;

    static String tipoAlimentacion = "Omnívoros, herbívoros, carnívoros";
    static String tipoSangre = "No tienen sangre con hemoglobina";
    static String habitadNatural = "Todos los ecosistemas: terrestres, acuáticos, aéreos";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Ovíparos (con metamorfosis en muchos casos)");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Traqueal (a través de tubos internos)");
    }

    public static void mostrarArtrópodo() {
        System.out.println("\n🕷️ Artrópodo detectado:");
        System.out.println("- Ojos: " + cantidadOjos);
        System.out.println("- Patas: " + cantidadPatas);
        System.out.println("- Exoesqueleto: " + tieneExoesqueleto);
        System.out.println("- Antenas: " + tieneAntenas);
        System.out.println("- Alas: " + tieneAlas);
        System.out.println("- Pinzas: " + tienePinzas);
        System.out.println("- Lengua: " + tieneLengua);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}