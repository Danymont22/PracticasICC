public class CotizadorPines{
    public static void main(String [] args){
       
       // declaracion de variables 
        int  precioCliente1 = -12;
        String cliente1 = "Robbie Valentino";
        char classCliente = 'A';
        double tasaAnual = 0.15;
        double plazoCliente1 = 21.0 / 12;
        double mesesDePago = 21.0;
        
        // condicionales para verificar datos validos
        
        if(precioCliente1 <= 0 || plazoCliente1 <= 0 || tasaAnual <= 0){
            System.out.println("Error: Tipo de dato invalido");
        }else{
        
        // condicionales para verificar el tipo de cliente

        if(classCliente != 'E' && classCliente != 'P' && classCliente != 'R'){
            System.out.println("Error en el tipo de cliente");
        }else{

        //condicionales para quitar puntos segun el tipo de cliente 

        if(classCliente == 'P'){
            tasaAnual -= 0.02;
        }else if(classCliente == 'R'){
            tasaAnual += 0.03;
        }
        //declaramos mas variables que nos serviran en el calculo
        double tasaMensual = (tasaAnual / 100) / 12;
        double interes = (precioCliente1 * tasaAnual * plazoCliente1);
        double total = precioCliente1 + interes;
        double mensualidades= total / 21.0;
        double deudaCompuesta = precioCliente1;
        double saldoFinal = precioCliente1 * Math.pow((1 + tasaMensual) , 21);

        //ciclo for para obtener el interes compuesto

        for(int z = 1; z <= mesesDePago; z++){ 
         
         deudaCompuesta = deudaCompuesta * (1 + tasaMensual);

         System.out.printf("El mes %d tiene un saldo de %.2f%n" , z, deudaCompuesta);
        }
       
        
        //imprimimos los datos a las terminal   

        System.out.printf(" - Cliente: %s %n - Tipo de cliente: %c %n - Deuda total: %.2f %n - Interes: %.2f %n - Pago mensual: %.2f %n"
        , cliente1, classCliente, total, interes, mensualidades);
        
        System.out.printf("Saldo final: %.2f" , saldoFinal);

        }
        }
    }
}