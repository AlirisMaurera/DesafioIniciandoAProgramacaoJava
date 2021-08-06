package ImprimirQuatrosGruposNumericos;

import java.util.Locale;
import java.util.Scanner;

public class ImprimirQuatroGruposNumericos {



    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner sc = new Scanner(System.in);

        String[] cpf = new String[4];
        String c = sc.nextLine();
        cpf = c.split("[.\\-]");

        for(int i = 0; i< cpf.length; i++)
        {System.out.printf("%s\n",cpf[i]);}

        sc.close();
    }
}

