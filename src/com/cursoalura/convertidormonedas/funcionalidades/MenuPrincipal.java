package com.cursoalura.convertidormonedas.funcionalidades;

public class MenuPrincipal {

    // Método para imprimir el menú de bienvenida
    public void imprimirMenu() {
        String menuPrincipal = """
                ***********************************************************************************
                **  B I E N V E N I D O S   A   M I   C O N V E R S O R   D E   M O N E D A S    **
                ***********************************************************************************
                **                                                                               **
                **  INSTRUCCIONES: Favor de ingresar el numero de opción de monedas a convertir  **
                **                                                                               **
                **                  1) Peso Mexicano    -->   Dólar Americano                    **
                **                  2) Peso Argentino   -->   Dólar Americano                    **
                **                  3) Real Brasileño   -->   Dólar Americano                    **
                **                  4) Dólar Americano  -->   Peso Mexicano                      **
                **                  5) Dólar Americano  -->   Peso Argentino                     **
                **                  6) Dólar Americano  -->   Real Brasileño                     **
                **                  7) SALIR                                                     **
                ***********************************************************************************
                Elija una opción válida:  """;

        System.out.print(menuPrincipal);
        System.out.print(" ");


    }
}




