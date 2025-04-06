/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosdeprogramación;

/**
 *
 * @author Torre
 */

import java.util.*;

public class semana4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        for(boolean comprando = true; comprando;){

             //Menu
             System.out.println("Bienvenido al Teatro Moro");
             System.out.println("Comprar entrada");
             System.out.println("Salir");
             System.out.print("Selecciona una opcion: ");
             
             int opcion = sc.nextInt();
             
             switch(opcion){
                 case 1:
                 //zona
                 System.out.println("***Teatro Moro zonas disponibles***");
                 System.out.println("Zona A:");
                 System.out.println("X X X X X");
                 System.out.println("X X X X X");
                 System.out.println("Zona B:");
                 System.out.println("X X X X");
                 System.out.println("X X X X");
                 System.out.println("Zona C:");
                 System.out.println("X X X");
                 System.out.println("X X X");
                 System.out.println(); // Salto de línea
                 int zona = 0;
                 boolean zonaValida= false;
                 while(!zonaValida){
                     System.out.print("Seleccione la zona (1, 2 o 3): ");
                     try{
                         zona=sc.nextInt();
                         if (zona >=1 && zona <=3){
                             zonaValida=true;
                         }else{
                              System.out.println("La zona no es valida.");                  
                         }
                     }catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Por favor ingrese un número válido.");
                            sc.next();
                        }
                 }
                //edad
                 int  edad = 0;
                 boolean edadValida=false;
                 double descuento = 0;
                 while(!edadValida){
                     try{
                         System.out.println("Ingrese su edad: ");
                         edad=sc.nextInt();
                         if (edad >= 6 && edad <= 25){
                             System.out.println("El descuento aplicado es del 10% para estudiantes.");
                             descuento=0.10;
                             edadValida=true;                             
                         }else if(edad >65){
                             System.out.println("El descuento aplicado es de 15% para la tercera edad.");
                             descuento=0.15;
                             edadValida=true;
                         }else {
                             System.out.println("No se aplica descuento.");
                             edadValida=true;
                         }
                     }catch (InputMismatchException e) {
                            System.out.println("Entrada inválida. Por favor ingrese un número válido.");
                            sc.next();
                        }
                 }
                 //calculo precio
                 double precioBase = 100.0;
                 double precioFinal = precioBase;
                 if (descuento >0){
                     precioFinal = precioBase - (precioBase*descuento);
                 }
                 
                 boolean compraConfirmada = false;
                 do {
                     System.out.println("¿Desea confirmar su compra? (S/N): ");
                     char respuesta = sc.next().charAt(0);
                     if(respuesta == 'S'|| respuesta == 's'){
                         System.out.println("Compra realizada con exito.");
                         compraConfirmada=true;
                         // Mostrar resumen de la compra
                            System.out.println("\n--- Resumen de la compra ---");
                            System.out.println("Ubicación del asiento: Zona " + (zona == 1 ? "A" : (zona == 2 ? "B" : "C")));
                            System.out.println("Precio base de la entrada: $" + precioBase);
                            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
                            System.out.println("Precio final a pagar: $" + precioFinal);
                     }else if (respuesta == 'N'|| respuesta == 'n'){
                         System.out.println("Compra Cancelada");
                         compraConfirmada=true;
                     }else{
                         System.out.println("Respuesta no valida.");
                     }
                 }while (!compraConfirmada);
                     System.out.println("¿Desea realizar otra compra? (S/N): ");
                    char otraCompra = sc.next().charAt(0);
                    if (otraCompra == 'N' || otraCompra == 'n') {
                        comprando = false;
                    }
                 
                 break;
                 case 2:
                 System.out.print("Usted esta saliendo del programa...");
                 comprando = false;
                 break;
                 default:
                     System.out.println("La opción que selcciono no es valida.");
                 
             }      
        }
    }      
} 
