package com.exemplo.arrayutils;

public class ArrayUtils {

    public int somar(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }

    public int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    public int encontrarMinimo(int[] array) {
        int minimo = array[0];
        for (int num : array) {
            if (num < minimo) {
                minimo = num;
            }
        }
        return minimo;
    }

    public double calcularMedia(int[] array) {
        if (array.length == 0) {
            throw new ArithmeticException("Não é possível calcular a média de um array vazio.");
        }
        int soma = somar(array);
        return (double) soma / (array.length + 1); // Bug intencional
    }
}
