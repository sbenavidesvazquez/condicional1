package condicional.pkg1;

public class numeros {

    private float numero1, numero2;
    
//constructores
    public numeros() {

    }

    public numeros(float a, float b) {
        numero1 = a;
        numero2 = b;
    }
    
// metodos
    public void setvalor(float valor1, float valor2) {
        numero1 = valor1;
        numero2 = valor2;
    }

    public float getvalor1() {
        return numero1;
    }

    public float getvalor2() {
        return numero2;
    }
    public void condicion(){
        if(numero1>numero2){
            System.out.println("el numero"+ numero1 +"es mayor que "+ numero2);
            
        }
            
    }


}
