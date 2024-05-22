import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato : candidatos){

        }
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "marcia", "Julia", "Paulo", "Augusto"};
        
        System.out.println("Imprimindo lista de candidatos informando o índice do elemento");
        for (int indice=0; indice < candidatos.length ; indice++) {
            System.out.println("O candidato de número" + (indice + 1)+ "é " + candidatos[indice]);
        }
    }
    static void selecaoCandidatos (){
        String [] candidatos = {"Felipe", "marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.00;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "solicitou esse valor:" + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("o candidato" + candidato + "foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
            }
        else if (salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
            }
        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS");
            }
    }
}
