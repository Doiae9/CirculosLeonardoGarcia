public class Circulo {
    private float area;
    private float diametro;
    private float Circun;
    private float radio;

    public float getRadio() {
        return radio;
    }
public Circulo(float radio){
        this.radio=radio;
}
    public void setRadio(float radio) {
        this.radio = radio;
    }
    public Circulo() {
        System.out.println("No sirvo para nada");
    }
}
