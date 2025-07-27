public class Platelmintos {

    static int cantidadSegmentos;
    static boolean tieneSimetriaBilateral;
    static boolean tieneSistemaDigestivo;
    static boolean tieneLengua;
    static boolean tieneNariz;

    static String tipoAlimentacion = "Parásitos, carnívoros o carroñeros";
    static String tipoSangre = "No poseen sangre verdadera";
    static String habitadNatural = "Ambientes acuáticos, cuerpos hospedadores";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Sexual y asexual (gran regeneración)");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Difusión a través del cuerpo");
    }

    public static void mostrarPlatelminto() {
        System.out.println("\n🦠 Platelminto detectado:");
        System.out.println("- Segmentos: " + cantidadSegmentos);
        System.out.println("- Simetría bilateral: " + tieneSimetriaBilateral);
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