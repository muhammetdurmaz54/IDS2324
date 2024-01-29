package it.unicam.cs.model;

import it.unicam.cs.model.Abstractions.UtenteAutenticato;

import java.util.Objects;

public abstract class Contenuto {
    protected final Comune comuneAssociato;
    protected final int id;
    protected String nome;
    protected final UtenteAutenticato utenteCreatore;

    public Contenuto(Comune comuneAssociato,int id, String nome, UtenteAutenticato utenteCreatore) {
        this.comuneAssociato=comuneAssociato;
        this.id = id;
        this.nome = nome;
        this.utenteCreatore=utenteCreatore;
    }

    public void setName(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new NullPointerException("Il nome deve avere almeno un carattere");
        }
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contenuto contenuto = (Contenuto) o;
        return id == contenuto.id && Objects.equals(comuneAssociato, contenuto.comuneAssociato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comuneAssociato, id);
    }
}
