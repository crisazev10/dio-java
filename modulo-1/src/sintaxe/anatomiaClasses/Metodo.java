package sintaxe.anatomiaClasses;

public class Metodo {

public static void main(String[] args) {
    
    String n1 = "Cristiano";
    String segundoNome = "Azevedo";
    String terceiroNome = "de Carvalho";

    String nomeCompleto = formatarNome ( n1, segundoNome, terceiroNome);

    System.out.println(nomeCompleto);

}

public static String formatarNome ( String primeiroNome, String segundoNome, String terceiroNome){
   // return primeiroNome.concat(" ").concat(segundoNome);
   return "O resultado do método é: " + primeiroNome + " " + segundoNome + " " + terceiroNome;
}

}