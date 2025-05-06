import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a palavra chave: ");
        String[] keyWord = sc.nextLine().split("");

        for (int i = 0; i < 100; i++) {
            System.out.println();
        }

        List<String> password = Arrays.asList(keyWord);
        List<String> mask = new ArrayList<>();

        for (String str : password){
            mask.add("-");
        }

        for (String str : mask){
            System.out.print(str + " ");
        }

        System.out.println("");

        int lideCount = 5;
//        int winCount = 0;

        while (lideCount > 0 && mask.contains("-")){
            System.out.println("");
            System.out.println("vidas: " + lideCount);
            System.out.print("Digite uma letra: ");
            String letra = sc.nextLine();

            if (password.contains(letra)){
                for (int i = 0; i < password.size(); i++) {
                    if (password.get(i).equals(letra)){
                        mask.set(i,letra);
                    }
                }

            }else {
                lideCount--;
            }

            for (String str : mask){
                System.out.print(str + " ");
            }

            System.out.println();

        }

        if (lideCount <= 0){
            System.out.println("Você perdeu! A palavra era: " + String.join("",password));
        }
        if (!mask.contains("-")){
            System.out.println("Parabéns você ganhou!");
        }

        sc.close();
    }
}