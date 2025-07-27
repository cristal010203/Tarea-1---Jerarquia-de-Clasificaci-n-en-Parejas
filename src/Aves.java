public class Aves {

    static int cantidadOjos;
    static int cantidadPatas;
    static boolean tieneHuesos;
    static boolean tieneAlas;
    static boolean tienePlumas;
    static boolean tienePico;
    static boolean tieneLengua;
    static boolean tieneNariz;

    static String tipoAlimentacion = "Omnívoros, granívoros, insectívoros";
    static String tipoSangre = "Sangre caliente";
    static String habitadNatural = "Bosques, humedales, ciudades, montañas";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Ovíparos");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Pulmonar con sacos aéreos");
    }

    public static void mostrarAve() {
        System.out.println("\n🦜 Ave detectada:");
        System.out.println("- Ojos: " + cantidadOjos);
        System.out.println("- Patas: " + cantidadPatas);
        System.out.println("- Huesos: " + tieneHuesos);
        System.out.println("- Alas: " + tieneAlas);
        System.out.println("- Plumas: " + tienePlumas);
        System.out.println("- Pico: " + tienePico);
        System.out.println("- Lengua: " + tieneLengua);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}