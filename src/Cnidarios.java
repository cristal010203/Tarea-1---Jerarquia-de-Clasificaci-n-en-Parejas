public class Cnidarios {

    static int cantidadTentaculos;
    static boolean tieneCavidadGastrica;
    static boolean tieneCnidocitos;
    static boolean tieneSimetriaRadial;
    static boolean tieneOjos;
    static boolean tieneNariz;

    static String tipoAlimentacion = "Carnívoros (capturan presas con tentáculos)";
    static String tipoSangre = "No poseen sistema circulatorio";
    static String habitadNatural = "Océanos, mares y arrecifes coralinos";

    public static void tipoDeReproduccion() {
        System.out.println("Tipo de Reproducción: Asexual y sexual (medusas y pólipos)");
    }

    public static void tipoDeRespiracion() {
        System.out.println("Tipo de Respiración: Difusión a través de la piel");
    }

    public static void mostrarCnidario() {
        System.out.println("\n🌊 Cnidario detectado:");
        System.out.println("- Tentáculos: " + cantidadTentaculos);
        System.out.println("- Cavidad gástrica: " + tieneCavidadGastrica);
        System.out.println("- Cnidocitos: " + tieneCnidocitos);
        System.out.println("- Simetría radial: " + tieneSimetriaRadial);
        System.out.println("- Ojos: " + tieneOjos);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Alimentación: " + tipoAlimentacion);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitadNatural);
        tipoDeReproduccion();
        tipoDeRespiracion();
    }
}