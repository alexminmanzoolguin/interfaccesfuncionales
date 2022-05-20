/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.Calcular;
/**
 *
 * @author alex_
 */

public class EjemploInterfazCalcular {
    public static void main(String[] args) {
        Calcular obj = (v1, v2) -> {
            int resultado = v1 + v2;
            System.out.println(resultado);
        };
        
        obj.calcular(10, 20);
    }
}
