public class Poriferos {

    static int cantidadPoros;
    static boolean tieneEspiculas;
    static boolean tieneSimetria;
    static boolean tieneNariz;
    static boolean tieneOjos;

    static String tipoAlimentacion = "Filtradores";
    static String tipoSangre = "No poseen sistema circulatorio";
    static String habitadNatural = "Ambientes acuáticos, especialmente marinos";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Asexual (gemación) y sexual");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Difusión por células");
    }

    public static void mostrarPorifero() {
        System.out.println("\n🧽 Porífero detectado:");
        System.out.println("- Poros: " + cantidadPoros);
        System.out.println("- Espículas: " + tieneEspiculas);
        System.out.println("- Simetría corporal: " + tieneSimetria);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Ojos: " + tieneOjos);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}