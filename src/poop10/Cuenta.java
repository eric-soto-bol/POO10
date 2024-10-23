/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 * La clase Cuenta representa una cuenta bancaria simple que permite 
 * realizar depósitos y retiros, y consultar el saldo disponible.
 * 
 * @author poo03alu36
 */
public class Cuenta {
    private double saldo;

    /**
     * Crea una cuenta con saldo inicial de 0.
     */
    public Cuenta() {
        this.saldo = 0;
    }

    /**
     * Crea una cuenta con un saldo inicial especificado.
     *
     * @param saldo el saldo inicial de la cuenta
     */
    public Cuenta(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta.
     *
     * @param saldo el nuevo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Deposita un monto en la cuenta, aumentando el saldo.
     *
     * @param monto el monto a depositar
     */
    public void depositar(double monto) {
        saldo += monto;
    }

    /**
     * Retira un monto de la cuenta, disminuyendo el saldo.
     *
     * @param monto el monto a retirar
     * @throws saldoInsuficienteException si el monto a retirar es mayor que el saldo disponible
     */
    public void retirar(double monto) throws saldoInsuficienteException {
        if (monto > saldo) {
            throw new saldoInsuficienteException("Saldo insuficiente");
        } else {
            saldo -= monto;
        }
    }

    /**
     * Consulta el saldo actual de la cuenta.
     *
     * @return el saldo de la cuenta
     */
    public double consultarSaldo() {
        return getSaldo();
    }

    /**
     * Devuelve una representación en cadena del objeto Cuenta.
     *
     * @return una cadena que representa el saldo de la cuenta
     */
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
}

