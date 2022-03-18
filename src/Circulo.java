public class Circulo {
    //atributo
    private float radio;

    public float getRadio() {
        return radio;
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public void setRadio() {
        this.radio = radio;

    }

    public Circulo() {
        System.out.println("No sirvo para nada");
    }
    //metodos
    //public float calculararea(){
    //return (float) (Math.PI*Math.pow(radio, 2)); }
    // public float calcularDiametro(){
    //return radio*2; }
    //public float calcularCircunferencia(){
    //opcion1
    //return (float) (Math.PI*radio*2);
    //opcion 2
    //return (float) (Math.PI*calcular Diametro())

    public float CalcArea(){
        float area=0;
        return (float) (Math.PI*Math.pow(radio, 2));
    }
    public float Calcdiametro(){
        return radio*2;
    }
    public float CalcCircunferencia(){
    return (float) (Math.PI*radio*2);
    }

    @Override
    public String toString() {
        return "El Circulo tiene un radio de " +radio+
                "\n El area del circulo es" +CalcArea()+
                "\nEl diametro del ciculo es"+Calcdiametro()+"\n La circunferencia es"+CalcCircunferencia();

    }
    }


