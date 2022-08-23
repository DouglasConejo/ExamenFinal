package com.cenfotec.examenfinalspring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String typeUser; //Si es de plan de guarderia, de lectura o de ambos.
    private String alergias; //Guardarlas como unsolo texto.
    private String Encargado;

    public Child() {
    }

    public Child(Long id, String name, String typeUser, String alergias, String encargado) {
        this.id = id;
        this.name = name;
        this.typeUser = typeUser;
        this.alergias = alergias;
        Encargado = encargado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String typeUser) {
        this.typeUser = typeUser;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEncargado() {
        return Encargado;
    }

    public void setEncargado(String encargado) {
        Encargado = encargado;
    }
}

