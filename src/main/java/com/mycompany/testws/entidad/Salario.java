/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testws.entidad;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author RayAj
 */
@XmlRootElement(name = "salario")
@XmlType(propOrder = {"salario"})
public class Salario {
    private int salario;

    public Salario(int salario) {
        this.salario = salario;
    }

    
    public Salario() {
    }

    @XmlElement
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
