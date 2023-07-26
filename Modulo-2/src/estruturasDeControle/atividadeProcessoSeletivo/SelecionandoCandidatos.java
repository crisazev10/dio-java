package estruturasDeControle.atividadeProcessoSeletivo;

import java.util.concurrent.ThreadLocalRandom;

public class SelecionandoCandidatos {
    
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatoAtual = 0;
        int candidatosSelecionados = 0;
        double salarioBase = 2000;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length ){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " informou o salario no valor " + salarioPretendido);
            if(salarioPretendido <= salarioBase){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }

            candidatoAtual++;
        }

        System.out.println("\nQuantidade de candidatos selecionados = " + candidatosSelecionados);
        System.out.println("Quantidade de candidatos avaliados = " + candidatoAtual);
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
     return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
