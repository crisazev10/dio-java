package sintaxe.metodos;

public class SmarTv {

        boolean ligada = false;
        int canal = 0;
        int volume = 0;


 

    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume (){
       volume++;
    }

    public void diminuirVolume (){
        volume--;
    }

    public void mudarCanal (){
        canal++;
    }

    public void voltarCanal (){
        canal--;
    }
}
