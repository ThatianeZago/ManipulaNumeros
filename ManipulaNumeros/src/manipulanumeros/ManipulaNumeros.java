
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
      System.out.println(" 2 - Ordenar valor decrescente");
      System.out.println(" 3 - Somar ímpares multiplicar pares");
      System.out.println(" 4 - Troca de valores entre variáveis");
      System.out.println(" 5 - Comparar números");
      System.out.println(" 6 - Calcular média de aluno");

      
      System.out.println(" 0 - Para sair");
      System.out.println("Seleione a opção pretendida: ");
      op = ler.nextInt();
      switch(op){
          case 0: break;
          case 1:
              leValores("Insira um valor: ","Insira outro valor: ");
              MaiorNumero.maior2(x,y);
            break;
          case 2:do{
              le1Valor("Insira um valor: ");
          }while(x<=0); 
                NumeroDecrescente.ordenaDecrescente(x);
             break;
           case 3: somaImparesMultiplicaPares(); break;
           case 4: leValores("Insira um valor: ","Insira outro valor: "); 
           TrocaNumero.trocaValoresEntreVariaveis(x,y);
           break;
           case 5: leValores("Insira um valor: ","Insira outro valor: "); 
           CompararNumero.Comparar2Valores(x,y);
           break;
           case 6: leValores("Insira um valor: ","Insira outro valor: "); 
            MediaALuno.registraNotas();
            break;
          default: System.out.println("Insira a opção válida.");
      }
    }while(op!=0);
    }

    private static void leValores(String s1, String s2) {       
         x = ler.nextInt();
         System.out.println(s2);
         y = ler.nextInt();
    }

    private static void le1Valor(String s1) {
         System.out.println(s1);
         x = ler.nextInt();
   }

    private static void somaImparesMultiplicaPares() {
        int i = 0;
        long par = 0;
        int impar = 0;
        
                
        for ( i = 0; i < 30; i++ ){
            if (i%2 == 0){
                if (i>2){
                par = par*i;
                }
            else{
            par = i;
            }
        }
        
        else{
            impar = impar+i;
                }
        
        }
        System.out.println("O valor da soma dos números impares é "+impar);
        System.out.println("A multiplicação dos valores pares é "+ par);
        } 
}
