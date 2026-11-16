package Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class ControlErrores {
    public static final int matriculaMinima = 0;
    public static final int matriculaMaxima = 9999;
    public static final int anioMinimo = 1990;
    public static final int anioMaximo = 2026;
    public static final float precioMinimo = 0;
    public static final float precioMaximo = 150000;
    
    public static final DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/mm/uuuu").withResolverStyle(ResolverStyle.SMART);
    
    public void validarMatricula(Coche coche){
        /*char matricula [] = coche.getMatricula().toCharArray();
        for(int i = 0; i <= matricula.length; i++){
            if (i < 4){
                if()
            }
        }*/
        
    }
    public void validarPrecio(Coche coche){
        float precio = coche.getPrecio();
        if(precio < 0 || precio > 150000){
            System.out.println("El precio no tiene un formato válido");
        }
    }
}
