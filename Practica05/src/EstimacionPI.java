public class EstimacionPI{
    public static void main(String [] args){

        /*Aqui declaro mis variables como dardosTotales
        la cual son los dardos disponibles y dardosCaidos 
        serian los dardos lanzados*/


        int dardosTotales = 1000000;
        int dardosCaidos = 0;
        int dardosDentro = 0;
        int dardosFuera = 0;

        while(dardosCaidos != dardosTotales){
            //Declaro las cordenadas aleatoreas X y Y
        double cordX = Math.random ();
        double cordY = Math.random ();

        //Declaro variables para el cuadrado de las cordenadas

        double cuadradoCordX = Math.pow(cordX, 2);
        double cuadradoCordY = Math.pow(cordY, 2);

        //hacemos la suma de cuadrados para obtener la distancia al origen

        double distAlOrigen = (cuadradoCordX + cuadradoCordY);

        //condisionales para ver si los dardos estan dentro o fuera

        if(distAlOrigen <= 1){
            dardosDentro++;
        }else if(distAlOrigen > 1){
            dardosFuera++;
        }

        //contador de los dardos
        dardosCaidos++;

        }

        //calculo con el metodo Monte Carlo

        double estimacionPI = (double)dardosDentro / dardosTotales * 4;

        //print para salida de texto a la terminal

        System.out.printf("Aproximacion de PI: %.6f %n " , estimacionPI);
        System.out.println("Dardos dentro:" + " " + dardosDentro);
        System.out.println("Dardos fuera:" + " " + dardosFuera);
    }
}