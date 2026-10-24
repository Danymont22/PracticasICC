public class PrecisionPI{
    public static void main(String [] args){

        double tolerancia = 0.01;
        double estimacion = 0;
        double errordist = Math.abs(estimacion - Math.PI);
        double dardosDentro = 0;
        double dardosTotales = 0;


        while(errordist >= tolerancia){

        double cordX = Math.random ();
        double cordY = Math.random ();

        double cuadradoCordX = Math.pow(cordX, 2);
        double cuadradoCordY = Math.pow(cordY, 2);

        double distAlOrigen = (cuadradoCordX + cuadradoCordY);

        if(distAlOrigen <= 1){
            dardosDentro++;
        }

        dardosTotales++;

        estimacion = 4*(dardosDentro / dardosTotales);
        errordist = Math.abs(estimacion - Math.PI);


        }

        System.out.println("Dardos lanzados:" + " " + dardosTotales);
        System.out.printf("Estimacion de pi: %.6f %n" ,estimacion);
        
    }
}