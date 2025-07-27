public class Reptiles {

    static int cantidadOjos;
    static int cantidadPatas;
    static boolean tieneHuesos;
    static boolean tieneEscamas;
    static boolean tieneCola;
    static boolean tieneLengua;
    static boolean tieneNariz;
    static boolean tieneDientes;

    static String tipoAlimentacion = "Carnívoros, herbívoros, insectívoros";
    static String tipoSangre = "Sangre fría";
    static String habitadNatural = "Desiertos, selvas, pantanos, rocas";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Ovíparos / Ovovivíparos");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Pulmonar");
    }

    public static void mostrarReptil() {
        System.out.println("\n🦎 Reptil detectado:");
        System.out.println("- Ojos: " + cantidadOjos);
        System.out.println("- Patas: " + cantidadPatas);
        System.out.println("- Huesos: " + tieneHuesos);
        System.out.println("- Escamas: " + tieneEscamas);
        System.out.println("- Cola: " + tieneCola);
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