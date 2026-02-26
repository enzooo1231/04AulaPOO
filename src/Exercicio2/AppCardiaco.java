package Exercicio2;

public class AppCardiaco {

    String nome;
    int idade;

   int frequenciaMax(){

       return 220 - idade;
   }

   double [] frequenciaAlvo(){

       double [] alvo  = new double[2];
       int fm = frequenciaMax();
       alvo[0] = 0.5 * fm;
       alvo[1] = 0.85 * fm;

       return alvo;
   }


}
