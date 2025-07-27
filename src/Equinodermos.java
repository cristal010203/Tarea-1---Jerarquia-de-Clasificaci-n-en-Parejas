public class Equinodermos {

    static int cantidadOjos;
    static int cantidadPatas; // brazos radiales
    static boolean tieneEspinas;
    static boolean tieneSistemaAmbulacral;
    static boolean tieneLengua;
    static boolean tieneNariz;

    static String tipoAlimentacion = "Depredadores, carroñeros, filtradores";
    static String tipoSangre = "No poseen sistema circulatorio clásico";
    static String habitadNatural = "Fondo marino, arrecifes, aguas saladas";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Ovíparos (frecuente regeneración)");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: A través de pies ambulacrales y branquias dérmicas");
    }

    public static void mostrarEquinodermo() {
        System.out.println("\n⭐ Equinodermo detectado:");
        System.out.println("- Ojos: " + cantidadOjos);
        System.out.println("- Brazos/Patas: " + cantidadPatas);
        System.out.println("- Espinas: " + tieneEspinas);
        System.out.println("- Sistema Ambulacral: " + tieneSistemaAmbulacral);
        System.out.println("- Lengua: " + tieneLengua);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}