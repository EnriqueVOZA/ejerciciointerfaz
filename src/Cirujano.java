public class Cirujano extends Medico {
    private Double honorariosAyudantes;

    public Cirujano(int id, String matricula, String nombre, Double importeBasico, Double honorariosAyudantes) {
        super(id, matricula, nombre, importeBasico);
        this.honorariosAyudantes = honorariosAyudantes;
    }

    @Override
    public Double calcularHonorario() {
        return getImporteBasico()+(honorariosAyudantes*2);
    }
}
