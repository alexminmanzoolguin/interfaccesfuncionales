/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.SimpleInterface;
/**
 *
 * @author alex_
 */

public class EjemploSimpleInterface {
    public static void main(String[] args) {
        SimpleInterface obj = () -> System.out.println("Dentro de la interfaz");        
        
        obj.procesar();
    }
}
