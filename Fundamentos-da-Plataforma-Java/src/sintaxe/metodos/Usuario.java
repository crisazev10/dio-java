package sintaxe.metodos;

public class Usuario {
    
    public static void main(String[] args) {
        
        SmarTv smarTv = new SmarTv();

        System.out.println("Tv está ligada? " + smarTv.ligada);
        System.out.println("Qual o canal? " + smarTv.canal);
        System.out.println("Qual o volume? " + smarTv.volume);

        smarTv.ligar();
        System.out.println("Novo status --> Tv está ligada? " + smarTv.ligada);

        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        System.out.println("Novo status --> Qual o volume? " + smarTv.volume);

        smarTv.mudarCanal();
        smarTv.mudarCanal();
        smarTv.mudarCanal();
        smarTv.mudarCanal();
        smarTv.mudarCanal();
        System.out.println("Novo status --> Qual o canal? " + smarTv.canal);

        smarTv.canal = 10;
        System.out.println("Novo status --> Qual o canal? " + smarTv.canal);

    }
}
