package domain.model;


import domain.interfaces.ITransaccion;

import java.util.ArrayList;

public abstract class Cuenta implements ITransaccion {

    protected String numeroCuenta;
    protected double saldo;


    protected abstract boolean puedeTransferir(double monto);

    protected abstract boolean tieneSaldoSuficiente(double monto);

    protected abstract boolean puedeOperar(double monto);

    protected abstract double saldoDisponible();
}