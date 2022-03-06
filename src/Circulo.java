public class Circulo {

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
    void diametro(){
       float dia=0;
        dia=radio*2;
    }
    void area(){
        float area=0;
        area= (float) (3.1416*(Math.pow(radio, 2)));
    }
    void Circun(){

    }
}
