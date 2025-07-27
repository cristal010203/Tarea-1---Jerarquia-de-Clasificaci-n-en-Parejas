
public class Mamiferos {

    static int cantidadOjos;
    static int cantidadPatas;
    static boolean tieneHuesos;
    static boolean tieneGarras;
    static boolean tienePezuñas;
    static boolean tieneDientes;
    static boolean tieneLengua;
    static boolean tieneNariz;

    static String tipoAlimentacion = "Herbívoros, carnívoros, omnívoros";
    static String tipoSangre = "Sangre caliente";
    static String habitadNatural = "Bosques, sabanas, montañas, ciudades";


    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Vivíparos");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Pulmonar");
    }

    public static void mostrarMamifero() {
        System.out.println("\n🐾 Mamífero detectado:");
        System.out.println("- Ojos: " + cantidadOjos);
        System.out.println("- Patas: " + cantidadPatas);
        System.out.println("- Huesos: " + tieneHuesos);
        System.out.println("- Garras: " + tieneGarras);
        System.out.println("- Pezuñas: " + tienePezuñas);
        System.out.println("- Dientes: " + tieneDientes);
        System.out.println("- Lengua: " + tieneLengua);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}