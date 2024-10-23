/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 //diagrama de clase y de donde hereda
    //cachar la excepcion saldo insuficiente
package poop10;

/**
 * La clase saldoInsuficienteException es una excepción personalizada que
 * se utiliza para indicar que una operación en una cuenta bancaria no se 
 * puede realizar debido a que el saldo es insuficiente.
 * 
 * Esta excepción extiende la clase {@link Exception} y puede ser lanzada
 * en situaciones donde se intente retirar más dinero del que hay disponible.
 * 
 * @author poo03alu14
 */
public class saldoInsuficienteException extends Exception {

    /**
     * Crea una nueva instancia de saldoInsuficienteException sin un mensaje de error.
     */
    public saldoInsuficienteException() {
    }

    /**
     * Crea una nueva instancia de saldoInsuficienteException con un mensaje de error específico.
     *
     * @param message el mensaje que describe la causa de la excepción
     */
    public saldoInsuficienteException(String message) {
        super(message);
    }
}
