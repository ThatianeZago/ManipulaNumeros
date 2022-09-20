package manipulanumeros;


class MediaALuno {
public static int [] notas;
    static void registraNotas(){
     int n;
     System.out.println("Quantas notas pretende inserir?");
     n = ManipulaNumeros.ler.nextInt();
     notas = new int[n];
     for(int x=0;x<n;x++){
      System.out.println("Inserir nota: "+(x+1));
      notas[x] = ManipulaNumeros.ler.nextInt();
     }
  mediaALuno();
    }

    private static void mediaALuno() {
        int tam = notas.length;
        int soma = 0;
        for (int x=0;x<tam;x++)
            soma+=notas[x];
        System.out.println("A média do aluno: "+(1.0*soma/tam));
     }
   
}




