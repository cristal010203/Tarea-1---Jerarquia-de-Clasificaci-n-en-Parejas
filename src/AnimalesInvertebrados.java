public class AnimalesInvertebrados {


    protected boolean tieneExoesqueleto;
    protected boolean tieneSegmentacionCorporal;
    protected boolean simetriaRadial;
    protected int cantidadTentaculos;
    protected boolean tieneCuticula;
    protected boolean tieneOjos;
    protected boolean tieneNariz;


    protected String tipoAlimentacion;
    protected String tipoSangre;       // No circulatorio, abierto, etc.
    protected String tipoReproduccion;
    protected String tipoRespiracion;
    protected String habitatNatural;


    public void respirar() {
        System.out.println("Respira mediante: " + tipoRespiracion);
    }

    public void reproducirse() {
        System.out.println("Se reproduce de forma: " + tipoReproduccion);
    }

    public void alimentarse() {
        System.out.println("Tipo de alimentación: " + tipoAlimentacion);
    }

    public void mostrarInformacion() {
        System.out.println(" Invertebrado:");
        System.out.println("- Exoesqueleto: " + tieneExoesqueleto);
        System.out.println("- Segmentado: " + tieneSegmentacionCorporal);
        System.out.println("- Simetría radial: " + simetriaRadial);
        System.out.println("- Tentáculos: " + cantidadTentaculos);
        System.out.println("- Cutícula: " + tieneCuticula);
        System.out.println("- Ojos: " + tieneOjos);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitatNatural);
        alimentarse();
        reproducirse();
        respirar();
    }
}