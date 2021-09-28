
package com.ceep.domain;

public class Vehiculo {
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    //CONSTRUCTOR
    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {    
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifa = tarifa;
        this.disponible = disponible;
    }

    //G&S
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" matricula: ").append(matricula);
        sb.append("\n marca: ").append(marca);
        sb.append("\n modelo: ").append(modelo);
        sb.append("\n color: ").append(color);
        sb.append("\n tarifa: ").append(tarifa);
        sb.append("\n disponible: ").append(disponible);
        return sb.toString();
    }
    
    
}
