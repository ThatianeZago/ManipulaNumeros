
package manipulanumeros;

import java.util.Scanner;

public class ManipulaNumeros {
public static Scanner ler = new Scanner(System.in);
public static int x,y;
  
    public static void main(String[] args) {
        int op;
    do{
      System.out.println("Menu de Operações com número: ");
      System.out.println(" 1 - Maior de 2 números");
      
      System.out.println(" 0 - Para sair");
      System.out.println("Seleione a opção pretendida: ");
      op = ler.nextInt();
      switch(op){
          case 0: break;
          case 1:
              leValores("Insira um valor: ","Insira outro valor: ");
              MaiorNumero.maior2(x,y);
              break;
          default: System.out.println("Insira a opção válida.");
      }
    }while(op!=0);
    }

    private static void leValores(String s1, String s2) {
         System.out.println(s1);
         x = ler.nextInt();
         System.out.println(s2);
         y = ler.nextInt();
    }
    
}
