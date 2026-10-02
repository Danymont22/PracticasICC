public class cotizador{
    public static void main (String [] args){

        int precioCliente1 = 12899;
        String cliente1 = "Robbie Valentino";
        char classCliente= 'E';
        double tasaAnual = 0.15;
        double plazoCliente1 = 21.0 / 12;
        double interes = (precioCliente1 * tasaAnual * plazoCliente1);
        double total = precioCliente1 + interes;
        double mensualidades= total / 21.0;


        System.out.printf(" - Cliente: %s %n - Tipo de cliente: %c %n - Deuda total: %.2f %n - Interes: %.2f %n - Pago mensual: %.2f %n"
        , cliente1, classCliente, total, interes, mensualidades);
    

    }
}