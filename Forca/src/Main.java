import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a palavra chave: ");
        String keyWord = sc.nextLine();

        for (int i = 0; i < 100; i++) {
            System.out.println();
        }

        String[] password = keyWord.split("");
        String[] mask = new String[password.length];

        for (int i = 0; i < password.length; i++) {

            mask[i] = "-";
            System.out.print(mask[i] + " ");
        }

        System.out.println("");

        int count = 5;

        while (count > 0){
            System.out.println("");
            System.out.print("Digite uma letra: ");
            String letra = sc.nextLine();



            for (int i = 0; i < password.length; i++) {


            }

            for (int i = 0; i < password.length; i++) {

                System.out.print(mask[i] + " ");

            }

            System.out.println("Vidas: " + count);
        }

        sc.close();
    }
}