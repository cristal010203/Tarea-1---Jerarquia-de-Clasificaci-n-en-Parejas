public class Anélidos {

    static int cantidadSegmentos;
    static boolean tieneSetas;
    static boolean tieneSistemaCirculatorio;
    static boolean tieneLengua;
    static boolean tieneNariz;

    static String tipoAlimentacion = "Detritívoros, herbívoros, carnívoros";
    static String tipoSangre = "Cerrado (como las lombrices)";
    static String habitadNatural = "Suelos húmedos, fondos marinos y agua dulce";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Sexual, algunos con regeneración");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Cutánea o branquial");
    }

    public static void mostrarAnelido() {
        System.out.println("\n🪱 Anélido detectado:");
        System.out.println("- Segmentos: " + cantidadSegmentos);
        System.out.println("- Tiene setas: " + tieneSetas);
        System.out.println("- Sistema circulatorio: " + tieneSistemaCirculatorio);
        System.out.println("- Lengua: " + tieneLengua);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}