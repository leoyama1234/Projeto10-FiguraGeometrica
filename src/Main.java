import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura>lista = new ArrayList<>();
        lista.add(new Circulo(new Ponto(1,1),2));
        lista.add(new Cilindro(3, 3, new Ponto(3, 3)));
        lista.add(new Circulo(new Ponto(1,1),2));
        lista.add(new Cilindro(3, 3, new Ponto(3, 3)));

        for (Figura figura : lista) {
            System.out.println(figura);
            System.out.println("Àrea = " + figura.calcularArea());
        }

    }
}
