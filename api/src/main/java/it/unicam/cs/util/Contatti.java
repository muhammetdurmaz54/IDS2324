package it.unicam.cs.util;

import jakarta.persistence.Embeddable;

@Embeddable
public class Contatti {
    private String telefono;
    private String email;
    private String fax;

    public Contatti(String telefono, String email) {
        this.telefono = telefono;
        this.email = email;
    }

    public Contatti() {

    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    public String getFax() {
        return fax;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
