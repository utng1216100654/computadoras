/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author nanyt
 */
public class Computadora {
    private String idCompu;      //No Serie
    private String modelo;
    private int idMarca;
    private int discoduro;
    private int ram;
    private String procesador;
    private char estado;       //'U'= Usada, 'N'= Nueva, 'D'= Descompuesta
    
    public Computadora(String idCompu, String modelo, int idMarca, int discoduro, int ram, String procesador) {
        this.idCompu = idCompu;
        this.modelo = modelo;
        this.idMarca = idMarca;
        this.discoduro = discoduro;
        this.ram = ram;
        this.procesador = procesador;
    }

    public int getDiscoduro() {
        return discoduro;
    }

    public char getEstado() {
        return estado;
    }

    public String getIdCompu() {
        return idCompu;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setDiscoduro(int discoduro) {
        this.discoduro = discoduro;
    }

    public void setEstado(char estado) {
        if ( estado == 'U' || estado == 'N' || estado == 'D'){   
            this.estado = estado;
        }
    }

    public void setIdCompu(String idCompu) {
        this.idCompu = idCompu;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
    
    
}
