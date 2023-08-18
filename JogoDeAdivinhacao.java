import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;

        while (tentativas < 5) {
            System.out.println("Digite um numero entre 0 e 100 :");
            int numeroDigitado = leitor.nextInt();
            tentativas++;

            if(numeroDigitado == numeroGerado){
                System.out.println("Parabéns, você acertou!!");
                System.out.println("GG");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Um pouco mais !!");
            }else {
                System.out.println("Um pouco menos!!");
            }
            if (tentativas == 5){
                System.out.println("Perdeu playboy");
            }
        }


    }

}
