/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufg.imcmvc.calculoImc;

/**
 *
 * @author Wallace
 */
public class calculadoraImc {

    public static float calcular(float altura, float peso, int sexo) {
        float quadrado = altura * altura;
        float calculo = peso / quadrado;

        if (sexo == 1) {
            if (calculo < 20.7) {
                //return calculo;
                System.out.print("Como homem, você está magro com esse indice: " + calculo);
            } else if (calculo >= 20.7 && calculo < 26.4) {
                //return calculo;
                System.out.print("Como homem, você está no peso ideal com esse indice: " + calculo);
            } else if (calculo >= 26.4 && calculo < 27.8) {
                //return calculo;
                System.out.print("Como homem, você está com sobre peso com esse indice: " + calculo);
            } else if (calculo >= 27.8 && calculo < 31.1) {
                //return calculo;
                System.out.print("Como homem, você está com obesidade com esse indice: " + calculo);
            } else if (calculo > 31.1) {
                //return calculo;
                System.out.print("Como homem, você está com obesidade grave com esse indice: " + calculo);
            }
        } else if (sexo == 2) {
            if (calculo < 19.1) {
                //return calculo;
                System.out.print("Como mulher, você está magro com esse indice: " + calculo);
            } else if (calculo >= 19.1 && calculo < 25.8) {
                //return calculo;
                System.out.print("Como mulher, você está no peso ideal com esse indice: " + calculo);
            } else if (calculo >= 25.8 && calculo < 27.3) {
                //return calculo;
                System.out.print("Como mulher, você está com sobre peso com esse indice: " + calculo);
            } else if (calculo >= 27.3 && calculo < 32.3) {
                //return calculo;
                System.out.print("Como mulher, você está com obesidade com esse indice: " + calculo);
            } else if (calculo > 32.3) {
                //return calculo;
                System.out.print("Como mulher, você está com obesidade grave com esse indice: " + calculo);
            }
        }

        return calculo;

    }
}
