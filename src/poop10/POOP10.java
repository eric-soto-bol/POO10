/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * La clase POOP10 contiene el método principal que ejecuta un programa 
 * simple de consola que realiza diversas operaciones, incluyendo 
 * la gestión de excepciones y la manipulación de cuentas bancarias.
 * 
 * @author poo03alu36
 */
public class POOP10 {

    /**
     * El método principal que inicia la ejecución del programa.
     * Este método realiza varias operaciones aritméticas, gestiona 
     * excepciones y manipula objetos de la clase Cuenta.
     *
     * @param args los argumentos de línea de comando (no utilizados en este programa)
     */
    public static void main(String[] args) {
        // Mensaje de saludo
        System.out.println("Hola mundo!");
        
        int a = 5;
        float c = (float) a / 2;
        System.out.println(c);
        
        // Inicialización de un arreglo y llenado de valores
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = i * 10;
        }
        
        // Manejo de excepción de desbordamiento de arreglo
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(b[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepcion de desbordamiento de memoria");
        }
        
        System.out.println("HOLA, HE SOBREVIVIDO");
        
        // Manejo de división por cero
        try {
            float d = 4 / 0;
            System.out.println(d);
        } catch (ArithmeticException e) {
            System.out.println("Division indeterminada");
        }
        
        // Ejemplo de uso de un método de división
        float n = miMetodoDivision(100, 2);
        System.out.println(n);
        
        try {
            float m = miMetodoDivision(100, 0);
            System.out.println(m);
        } catch (ArithmeticException ae) {
            System.out.println("Excepcion aritmetica permeada");
            System.out.println(ae.getStackTrace());
            ae.printStackTrace();
        }
        
        System.out.println("Seguimos");
        float x = miMetodoDivision(20, 5);
        System.out.println(x);
        
        // Manejo de operación no soportada
        try {
            int w = suma(8, 5);
        } catch (UnsupportedOperationException ex) {
            System.out.println("Excepcion de operacion no soportada");
            System.out.println("Atributo mensaje:");
            System.out.println(ex.getMessage());
        }
        
        System.out.println("#######################");
        
        // Ejemplo de uso de la clase Cuenta
        Cuenta cuenta = new Cuenta(100.0f);
        System.out.println(cuenta.consultarSaldo());
        cuenta.depositar(100);
        System.out.println(cuenta.consultarSaldo());
        
        // Manejo de saldo insuficiente
        try {
            cuenta.retirar(300);
        } catch (saldoInsuficienteException ex) {
            System.out.println("Excepcion lanzada");
        }
        
        System.out.println(cuenta.consultarSaldo());
    }

    /**
     * Realiza una división de dos números enteros.
     *
     * @param f el numerador
     * @param f0 el denominador
     * @return el resultado de la división
     * @throws ArithmeticException si se intenta dividir por cero
     */
    private static float miMetodoDivision(int f, int f0) throws ArithmeticException {
        return f / f0;
    }

    /**
     * Método que simula una suma, pero lanza una excepción.
     *
     * @param i el primer número entero
     * @param i0 el segundo número entero
     * @throws UnsupportedOperationException siempre se lanza esta excepción
     */
    private static int suma(int i, int i0) {
        throw new UnsupportedOperationException("Operacion no soportada");
    }
}


