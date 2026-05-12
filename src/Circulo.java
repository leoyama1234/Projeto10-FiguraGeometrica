public class Circulo extends Figura{
   private double raio;
   private Ponto ponto;

    public Circulo(Ponto ponto, double raio) {
        this.raio = raio;
        this.ponto = ponto;
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea(){
        double area;
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", ponto=" + ponto +
                '}';
    }
}
