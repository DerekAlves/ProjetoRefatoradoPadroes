package projetop1;

public class CimaCMD implements Command
{

    public void move(Veiculos vehic)
    {

        vehic.setX( vehic.getX() == 1 ? vehic.getX() + 27 : vehic.getX() - 1 );//INLINE METHOD PARA SUBSTITUIR O SMELL ABAIXO

        /*if(x == 1){//SMELL
            x += 27;
        }
        else{
            x -= 1;
        }*/
    }

}
