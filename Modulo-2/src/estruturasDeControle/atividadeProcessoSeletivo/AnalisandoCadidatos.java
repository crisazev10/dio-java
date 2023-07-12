package estruturasDeControle.atividadeProcessoSeletivo;

public class AnalisandoCadidatos {
    public static void main(String[] args) {
        CompararSalario(2500, 2000);

        CompararSalario(2500, 2500);

        CompararSalario(2500, 4000);
    }

    static void CompararSalario(double salarioBase, double salarioPretendido){
        if(salarioBase > salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA.");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    }
}
