public class Dermatologo extends Medico{
    private Double importeMeds;

    public Dermatologo(int id, String matricula, String nombre, Double importeBasico, Double importeMeds) {
        super(id, matricula, nombre, importeBasico);
        this.importeMeds = importeMeds;
    }

    @Override
    public Double calcularHonorario() {
        return getImporteBasico()+importeMeds;
    }
}
