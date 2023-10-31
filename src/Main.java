import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Medico> listaMedicos = new ArrayList<>();

        Medico medico1 = new Cardiologo(1,"AA","Enrique",99.99,850.00);
        Medico medico2 = new Dermatologo(2,"AB","Adriana",350.00,975.00);
        Medico medico3 = new Cirujano(3,"AC","Juan",500.00,350.50);

        listaMedicos.add(medico1);
        listaMedicos.add(medico2);
        listaMedicos.add(medico3);

        for (Medico medicos : listaMedicos) {
            System.out.println("Los honorarios son: "+medicos.calcularHonorario());
        }
    }
}