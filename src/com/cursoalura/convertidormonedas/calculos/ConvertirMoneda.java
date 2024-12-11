package com.cursoalura.convertidormonedas.calculos;

import com.cursoalura.convertidormonedas.funcionalidades.AvanceDePrograma;
import com.cursoalura.convertidormonedas.funcionalidades.ConsultaDeMoneda;
import com.cursoalura.convertidormonedas.funcionalidades.FechaDeHoy;
import com.cursoalura.convertidormonedas.funcionalidades.Monedas;

import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaDestino, ConsultaDeMoneda consulta, Scanner teclado){
        double cantidad;
        double conversionDeMoneda;

        Monedas monedas = consulta.buscarMonedas(monedaBase, monedaDestino);

        System.out.println("El tipo de cambio para hoy ("+ FechaDeHoy.imprimeLaFecha()+"), de la moneda: " + monedaBase
                            + " a la moneda: " + monedaDestino + " es de: " +  monedas.conversion_rate());

        System.out.println("Ingrese la cantidad de " + monedaBase + " que desea convertir a " + monedaDestino + ": ");

        cantidad = teclado.nextDouble();

        System.out.println("La cantidad a convertir de " + cantidad);

        conversionDeMoneda = cantidad * monedas.conversion_rate();

        System.out.println("***********************************************************************************");
        System.out.println("El resultado de la conversión es: "+ cantidad +" "+ monedaBase + " equivalen a: " +conversionDeMoneda + " " + monedaDestino);
        System.out.println("***********************************************************************************");

        AvanceDePrograma avance = new AvanceDePrograma();

        avance.Avanzar();

    }
}
