public class AnimalesVertebrados {


    protected boolean tieneColumnaVertebral = true;
    protected boolean tieneCerebro = true;
    protected int cantidadExtremidades;
    protected boolean tienePiel;
    protected String tipoPiel; // escamas, plumas, pelo, etc.
    protected boolean tieneOjos;
    protected boolean tieneNariz;


    protected String tipoAlimentacion; // herbívoro, carnívoro, omnívoro
    protected String tipoSangre;       // sangre caliente/fría
    protected String tipoReproduccion; // ovíparo, vivíparo, etc.
    protected String tipoRespiracion;  // pulmonar, branquial, cutánea
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
        System.out.println("- Vertebrado:");
        System.out.println("- Columnas vertebral: " + tieneColumnaVertebral);
        System.out.println("- Cerebro: " + tieneCerebro);
        System.out.println("- Piel: " + tienePiel + " (" + tipoPiel + ")");
        System.out.println("- Extremidades: " + cantidadExtremidades);
        System.out.println("- Ojos: " + tieneOjos);
        System.out.println("- Nariz: " + tieneNariz);
        System.out.println("- Sangre: " + tipoSangre);
        System.out.println("- Hábitat: " + habitatNatural);
        alimentarse();
        reproducirse();
        respirar();
    }
}