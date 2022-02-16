import java.util.Scanner;

public class A1E20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //asignar variables
        int Numero;
        int d1;
        int d2;
        int d4;
        int d5;
        String Cadena;
        
        //pedir valor
        System.out.print("Ingrese un numero de 5 digitos: ");
        Numero = scanner.nextInt();

        //separar los numeros
        Cadena = Integer.toString(Numero);
        d1 = Integer.parseInt(Cadena.substring(0, 1));
        d2 = Integer.parseInt(Cadena.substring(1, 2));
        d4 = Integer.parseInt(Cadena.substring(3, 4));
        d5 = Integer.parseInt(Cadena.substring(4, 5));

        //hacer condiciones para ver si se cumplen 
        if ((d1 == d5) && (d2 == d4)) {

            System.out.println("Es Capicua");

        } else {

            System.out.println("No es Capicua");

        }
    }

}
