package Principal;

public class Sobrecarga {

    /**
     * Vemos metodos que tienen el nombre similar pero en la sobrecarga la diferencia son
     * los parametros de los metodos como vemos y de igual manera puede ser con la sobrecarga de metodos
     * @param numero1
     * @param numero2
     * @return
     */
    public static int suma(int numero1, int numero2){

        return numero1+numero2;

    }
    public static int suma(int numero1, int numero2, int numero3){

        return numero1+numero2+numero3;
    }

    public Sobrecarga(){
        System.out.println("Constructor no parametro");
    }
    public Sobrecarga(String mensaje){
        System.out.println(mensaje);
    }

    public static void main(String[] args){

        Sobrecarga sobrecarga = new Sobrecarga();
        Sobrecarga sobrecarga1 = new Sobrecarga("Constructor con parametro");

        int total = suma(10, 10);
        System.out.println("La suma es " +total);
        total = suma(15, 15, 10);
    }

}
