public class ProgramaNuevo{	
	public static void main(String[] args) {
	
	//declaracion de variable string para guardar texto
	String producto = "Laptop para la carrera";
	//declaracion de variable int para guardar el precio 
	int precio = 15000;
	//declaracion de variable int para guardar el valor del descuento 
	int descuento = 3000;
	//declaracion de varible double para guardar el plazo de meses a pagar
	double meses = 18.0;

    /**System.out.println es un comando que sirve para imprimir en la terminal lo que este dentro del parentesis
    en esta primer linea se impimira ===Ficha de compra=== */
	System.out.println("=== Ficha de compra ===");
	//en esta linea se imprimira Producto: (y lo guardado en la variable producto) 
	// System.out.println("- Producto : " + producto);	
	//en esta linea se imprime Precio con descuento: (y se hara el calculo del precio con el descuento)
	System.out.printf("- Producto: %s %n - Precio con descuento : %d %n - Plazo de pago en anios : %.2f %n - Pago mensual: %.2f %n"
	, producto, (precio - descuento), (meses / 12.0), ((precio - descuento) / meses) );
	
	/**System.out.println("- Plazo de pago en anios : " + (meses / 12.0));
	System.out.printf("- Pago mensual : %.3f %n", ((precio - descuento) / meses), );*/
	System.out.println("=== Fin de la ficha ===");  
	}
}