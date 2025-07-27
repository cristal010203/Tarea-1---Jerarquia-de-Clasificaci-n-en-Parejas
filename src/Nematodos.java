public class Nematodos {

    static int cantidadSegmentos;
    static boolean tieneCuticula;
    static boolean tieneSistemaDigestivo;
    static boolean tieneLengua;
    static boolean tieneNariz;

    static String tipoAlimentacion = "Parásitos, bacterívoros, depredadores";
    static String tipoSangre = "No poseen sistema circulatorio";
    static String habitadNatural = "Suelos, agua, cuerpos hospedadores";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Sexual, algunos partenogenéticos");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Difusión por la cutícula");
    }

    public static void mostrarNematodo() {
        System.out.println("\n🧬 Nematodo detectado:");
        System.out.println("- Segmentos: " + cantidadSegmentos);
        System.out.println("- Cutícula: " + tieneCuticula);
        System.out.println("- Sistema digestivo: " + tieneSistemaDigestivo);
        System.out.println("- Lengua: " + tieneLengua);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}