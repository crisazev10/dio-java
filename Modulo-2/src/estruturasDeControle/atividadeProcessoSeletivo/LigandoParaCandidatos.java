package estruturasDeControle.atividadeProcessoSeletivo;

import java.util.Random;

public class LigandoParaCandidatos {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        for(String candidato : candidatos){
            ligarParaCandidato(candidato);
        }
    }

    static void ligarParaCandidato(String candidato){
        int tentativas = 1;
        boolean atendeu = false;
        boolean  continuarLigando = true;

        do{
            atendeu = atender();
            continuarLigando = !atendeu;

            if(continuarLigando){
                tentativas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO.");
            }

        } while(continuarLigando && tentativas < 3);

        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativas + " TENTATIVA");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO TENTATIVAS " + tentativas + " REALIZADA");
        }
    }

    //método auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}
}
