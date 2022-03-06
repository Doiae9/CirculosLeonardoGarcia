public class Circulo {
    private float dia;
    private float Circun;
    private float radio;

    public float getRadio() {
        return radio;
    }
public Circulo(float radio){
        this.radio=radio;
}
    public void setRadio() {
        this.radio = radio;

    }

    public Circulo() {
        System.out.println("No sirvo para nada");
    }
    public void diametro(){
        dia=radio*2;
    }
    public void Area(){
        float area=0;
        area= (float) (3.1416*(Math.pow(radio, 2)));
    }
    public void Circunferencia(){
        float circun=0;
        this.dia=dia;
        circun= (float) (3.141645*dia/(3.1416*radio*2));
    }


}
