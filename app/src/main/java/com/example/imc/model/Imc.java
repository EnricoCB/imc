package com.example.imc.model;

public class Imc {
    private double peso;
    private double altura;
    private double imc;

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularImc() {
        this.imc = this.peso / (this.altura * this.altura);
        return this.imc;
    }
}
