import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int contador = 10;
        int soma = 0;
        int numero = 1;
        System.out.println("Digite 10 valores: ");
        while (contador !=0){

        System.out.print(numero + "º = ");
        int valor = scanner.nextInt();
        
        numero++;
        soma = valor + soma;
        contador--;
        }
        System.out.print("A soma desses valores é de: " + soma);
    }
}
