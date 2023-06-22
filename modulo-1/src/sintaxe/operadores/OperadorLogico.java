package sintaxe.operadores;

public class OperadorLogico {
    
    public static void main(String[] args) {
        
        boolean condicao1 = true;
        boolean condicao2 = false;

        /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
        expressões. 
        É como se estivesse escrito:
        "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
        */

        if(condicao1 && condicao2)
            System.out.println("Os dois valores precisam ser verdadeiros");;

        //Se condicao1 OU condicao2 for verdadeira, executar código.
        if(condicao1 || condicao2)
            System.out.println("Um dos valores precisa ser verdadeiro");

        // Comparação Avançada
        /*A duplicidade nos operadores lógicos é um recurso conhecido como Operador Abreviado,
        isso quer dizer que, se a condição1 atender aos critérios, não será necessário validar a condição2. */

        int numero1 = 1;
        int numero2 = 1;

        if(numero1== 2 & numero2 ++ == 2 )
            System.out.println("As 2 condições são verdadeiras");

        System.out.println("O numero 1 agora é " + numero1);
        System.out.println("O numero 2 agora é " + numero2); // O valor do numero2 foi incrementado

        // Vamos mudar a linha 5 do código acima para: if(numero1== 2 && numero2 ++ == 2 )
    }
}
