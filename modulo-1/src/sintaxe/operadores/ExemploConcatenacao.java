package sintaxe.operadores;

public class ExemploConcatenacao {
    
    public static void main(String[] args) {
        
        //qual o resultado das expressoes abaixo?
        String concatenacao ="?"; 
        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

    }
}
