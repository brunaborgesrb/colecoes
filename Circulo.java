public class Circulo {

    //atributo
    double raio;
    double area;

    //construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    //get e set
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    //metodo
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
    
}