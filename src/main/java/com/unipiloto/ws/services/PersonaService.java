package com.unipiloto.ws.services;

import com.unipiloto.ws.model.Persona;
import com.unipiloto.ws.model.SalarioPromedioResponse;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlRootElement;

@Path("persona")
@XmlRootElement
public class PersonaService {

    private static List<Persona> lista = new ArrayList<>();

    static {
        lista.add(new Persona(1, "Juan", 25));
        lista.add(new Persona(2, "Ana", 30));
        lista.add(new Persona(3, "Carlos", 40));
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Persona> getPersonas() {
        return lista;
    }

    @GET
    @Path("salarioPromedio")
    @Produces(MediaType.APPLICATION_XML)
    public SalarioPromedioResponse getSalarioPromedio() {
        double suma = 0;
        for (Persona p : lista) {
            suma += p.getSalario();
        }
        double promedio = suma / lista.size();
        return new SalarioPromedioResponse(promedio);
    }

    @GET
    @Path("sumaSalarios")
    @Produces(MediaType.APPLICATION_JSON)
    public double getSumaSalarios() {
        double total = 0;
        for (Persona p : lista) {
            total += p.getSalario();
        }
        return total;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void agregarPersona(Persona persona) {
        lista.add(persona);
    }
}
