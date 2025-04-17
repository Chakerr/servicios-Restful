package com.unipiloto.ws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SalarioPromedioResponse {
    private double salarioPromedio;

    public SalarioPromedioResponse() {}

    public SalarioPromedioResponse(double salarioPromedio) {
        this.salarioPromedio = salarioPromedio;
    }

    public double getSalarioPromedio() {
        return salarioPromedio;
    }

    public void setSalarioPromedio(double salarioPromedio) {
        this.salarioPromedio = salarioPromedio;
    }
}