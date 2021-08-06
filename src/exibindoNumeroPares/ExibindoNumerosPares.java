package exibindoNumeroPares;


import java.util.Scanner;


public class ExibindoNumerosPares {

    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);
        System.out.println("Escreva um numero Par");
        var n = numero.nextInt();
        numerosPares(n);
    }

    public static void numerosPares(int n){
        for (var i = 1; i <= n; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }

 }

