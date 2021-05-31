/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasligadas;

/**
 * @author Samuel Colmenares. Clase nodo principal.
 */
public class Estudiante {

    private String nombre;
    private String carnet;
    private int semestre;
    private int creditos;
    private int valorCredito;
    private double descuento;
    private double totalPagar;
    private Estudiante sigEstudiante;

    /**
     * Constructor de Estudiante con llenado de propiedades.
     *
     * @param nombre
     * @param carnet
     * @param semestre
     * @param creditos
     * @param valorCredito
     * @param descuento
     */
    public Estudiante(String nombre, String carnet, int semestre, int creditos, int valorCredito, double descuento) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.semestre = semestre;
        this.creditos = creditos;
        this.valorCredito = valorCredito;
        this.descuento = descuento;
        sigEstudiante = null;
        calcularTotal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
        calcularTotal();
    }

    public long getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(int valorCredito) {
        this.valorCredito = valorCredito;
        calcularTotal();
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
        calcularTotal();
    }

    public Estudiante getSigEstudiante() {
        return sigEstudiante;
    }

    public void setSigEstudiante(Estudiante nuevoEstudiante) {
        this.sigEstudiante = nuevoEstudiante;
    }
    
    public double getTotalPagar() {
        return totalPagar;
    }
    
    private void calcularTotal() {
        this.totalPagar = this.creditos * this.valorCredito;
        if (this.descuento > 0) {
            double desc = 1 - (this.descuento / 100);
            this.totalPagar = desc * this.getTotalPagar();
        }
    }
}
