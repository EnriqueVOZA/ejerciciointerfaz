public class Cardiologo extends Medico{
    private Double importeEstudio;

    public Cardiologo(int id, String matricula, String nombre, Double importeBasico, Double importeEstudio) {
        super(id, matricula, nombre, importeBasico);
        this.importeEstudio = importeEstudio;
    }

    @Override
    public Double calcularHonorario() {
        return getImporteBasico()+importeEstudio;
    }

}
