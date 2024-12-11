package com.cursoalura.convertidormonedas.principal;

import com.cursoalura.convertidormonedas.calculos.ConvertirMoneda;
import com.cursoalura.convertidormonedas.funcionalidades.ConsultaDeMoneda;
import com.cursoalura.convertidormonedas.funcionalidades.MenuPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ConsultaDeMoneda consulta = new ConsultaDeMoneda();
        int opcion = 0;



        while (opcion != 7){

            MenuPrincipal menuBievenida = new MenuPrincipal();
            menuBievenida.imprimirMenu();

            opcion = teclado.nextInt();
           // System.out.println("La opción elegida es: "+ opcion);

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("MXN", "USD", consulta, teclado);
                    break;
                case 2:
                    ConvertirMoneda.convertir("ARS", "USD", consulta, teclado);
                    break;
                case 3:
                    ConvertirMoneda.convertir("BRL", "USD", consulta, teclado);
                    break;
                case 4:
                    ConvertirMoneda.convertir("USD", "MXN", consulta, teclado);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD", "ARS", consulta, teclado);
                    break;
                case 6:
                    ConvertirMoneda.convertir("USD", "BRL", consulta, teclado);
                    break;
                case 7:
                    System.out.println("Regrese pronto...");;
                    break;
                default:
                    System.out.println("Opción no valida!!!");
                    break;
            }

        }

    }
}
