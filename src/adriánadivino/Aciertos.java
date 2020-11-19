package adriánadivino;

import java.util.Scanner;

public class Aciertos {
	//Funciona perfecto. Revisado por Juan Alberto, Un saludo y suerte en los exámenes!!!
    public static void main(String[] args) {
        int n = 0,cont = 0;
        int min = 10;
        int max = 50;
        int x = (int) (Math.random() * (max - min + 1) + min);
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}