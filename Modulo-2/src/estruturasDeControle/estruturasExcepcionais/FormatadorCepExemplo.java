package estruturasDeControle.estruturasExcepcionais;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        
        // Exemplo de exceção customizada

        try {

            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
            System.out.println("O cep inserido não possui 8 dígitos!");
            System.out.println("Digite apenas números, sem caracteres especiais.");
        }
    }
    
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
}

