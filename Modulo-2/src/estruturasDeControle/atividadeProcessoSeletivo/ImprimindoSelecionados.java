package estruturasDeControle.atividadeProcessoSeletivo;

public class ImprimindoSelecionados {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Usando o 'for' convencional: ");

        for(int indice = 0; indice < candidatos.length; indice ++){
            System.out.println("O candidato selecionado nº " + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("\nUsando 'for each': ");

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado é o " + candidato);
        }
    }
}
