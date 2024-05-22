public class ResultadoEscolar {
   
    public static void main (String[] args) {
       /* int nota = 6;

        if (nota >= 7)
         System.out.println("Aprovado");

         else if ( nota >= 5 && nota < 7)
         System.out.println ("Recuperação");

        else
         System.out.println("Reprovado");*/

         //Expressão ternária
         int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

    }

}
