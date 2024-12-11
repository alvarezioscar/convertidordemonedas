package com.cursoalura.convertidormonedas.funcionalidades;

import java.time.LocalDate;

public class FechaDeHoy {
    public static LocalDate imprimeLaFecha(){
        LocalDate fechaHoy = LocalDate.now();
        return fechaHoy;
    }
}
