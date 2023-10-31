abstract class Medico implements CalculoHonorario{

    private int id;
    private String matricula;
    private String nombre;
    private Double importeBasico;

    public Medico(int id, String matricula, String nombre, Double importeBasico) {
        this.id = id;
        this.matricula = matricula;
        this.nombre = nombre;
        this.importeBasico = importeBasico;
    }


    public Double getImporteBasico() {
        return importeBasico;
    }




}
