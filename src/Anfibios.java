public class Anfibios {

    static int cantidadOjos;
    static int cantidadPatas;
    static boolean tieneHuesos;
    static boolean tienePielHumeda;
    static boolean tieneLengua;
    static boolean tieneNariz;
    static boolean tieneCola;

    static String tipoAlimentacion = "Carnívoros (insectívoros en su mayoría)";
    static String tipoSangre = "Sangre fría";
    static String habitadNatural = "Zonas húmedas, ríos, lagos, bosques";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Ovíparos (con metamorfosis)");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Pulmonar y cutánea (a través de la piel)");
    }

    public static void mostrarAnfibio() {
        System.out.println("\n🐸 Anfibio detectado:");
        System.out.println("- Ojos: " + cantidadOjos);
        System.out.println("- Patas: " + cantidadPatas);
        System.out.println("- Huesos: " + tieneHuesos);
        System.out.println("- Piel húmeda: " + tienePielHumeda);
        System.out.println("- Lengua: " + tieneLengua);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Cola: " + tieneCola);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}
