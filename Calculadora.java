package com.mycompany.calculadora;

/**
 * Esta clase representa una calculadora simple con operaciones básicas. Permite
 * realizar sumas, restas, multiplicaciones, divisiones y comparaciones. Además,
 * mantiene un registro del último resultado y la última operación realizada.
 * @author ALEX
 * @version 1.0
 */
public class Calculadora {
    private float lastResult; // Último resultado calculado
    private String lastOp; // Última operación realizada
    /**
     * Obtiene el último resultado calculado.
     * @return El último resultado.
     */
    public float getLastResult() {
        return this.lastResult;
    }
    /**
     * Obtiene la última operación realizada.
     * @return La última operación.
     */
    public String getLastOp() {
        return this.lastOp;
    }
    /**
     * Realiza la suma de dos números.
     * @param op1 Primer operando.
     * @param op2 Segundo operando.
     * @return El resultado de la suma.
     */
    public float suma(float op1, float op2) {
        float result = op1 + op2;
        this.lastResult = result;
        this.lastOp = "Suma";
        return result;
    }
    /**
     * Realiza la resta de dos números.
     * @param op1 Primer operando.
     * @param op2 Segundo operando.
     * @return El resultado de la resta.
     */
    public float resta(float op1, float op2) {
        float result = op1 - op2;
        this.lastResult = result;
        this.lastOp = "Resta";
        return result;
    }
    /**
     * Realiza la multiplicación de dos números.
     * @param op1 Primer operando.
     * @param op2 Segundo operando.
     * @return El resultado de la multiplicación.
     */
    public float multiplica(float op1, float op2) {
        float result = op1 * op2;
        this.lastResult = result;
        this.lastOp = "Multiplica";
        return result;
    }
    /**
     * Realiza la división de dos números.
     * @param op1 Primer operando (dividendo).
     * @param op2 Segundo operando (divisor).
     * @return El resultado de la división.
     */
    public float divideix(float op1, float op2) {
        float result = op1 / op2;
        this.lastResult = result;
        this.lastOp = "Divideix";
        return result;
    }
    /**
     * Compara dos números para determinar si el primero es mayor que el
     * segundo.
     * @param op1 Primer número.
     * @param op2 Segundo número.
     * @return `true` si op1 es mayor que op2, `false` en caso contrario.
     */
    public boolean majorQue(float op1, float op2) {
        return op1 > op2;
    }
    /**
     * Restablece los valores del último resultado y la última operación.
     */
    public void restablecer() {
        this.lastResult = 0;
        this.lastOp = "Ninguna";
    }
}
