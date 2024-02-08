package it.unicam.cs.model;

import it.unicam.cs.util.Indirizzo;
import it.unicam.cs.util.Posizione;

import java.util.List;

/** La classe POI, Point of interest rappresenta un punto di interesse presente nel territorio del comune.
 **/
public abstract class POI<T>{
    private final String id;
    private final String nome;
    private final Posizione posizione;
    private final T tipo;
    private final String idContributore;
    private final String idComuneAssociato;
    private final Indirizzo indirizzo;
    private final List<ContenutoMultimediale> contenutiMultimediali;
    private final List<ContenutoMultimediale> contenutiMultimedialiInPending;
    private final List<Evento> eventiAssociati;

    public POI(String id, String nome,Posizione posizione, T tipo, String idContributore,
               String idComuneAssociato, Indirizzo indirizzo, List<ContenutoMultimediale> contenutiMultimediali,
               List<ContenutoMultimediale> contenutiMultimedialiInPending, List<Evento> eventiAssociati) {
        this.id = id;
        this.nome = nome;
        this.posizione = posizione;
        this.tipo = tipo;
        this.idContributore = idContributore;
        this.idComuneAssociato = idComuneAssociato;
        this.indirizzo = indirizzo;
        this.contenutiMultimediali=contenutiMultimediali;
        this.contenutiMultimedialiInPending=contenutiMultimedialiInPending;
        this.eventiAssociati = eventiAssociati;
    }
    public void aggiungiContenutoMultimediale(ContenutoMultimediale contenutoMultimediale){
        this.contenutiMultimediali.add(contenutoMultimediale);
    }

    public void aggiungiContenutoMultimedialeInPending(ContenutoMultimediale contenutoMultimediale) {
        this.contenutiMultimedialiInPending.add(contenutoMultimediale);
    }
    public void rimuoviContenutoMultimedialeInPending(ContenutoMultimediale contenutoMultimediale){
        this.contenutiMultimediali.remove(contenutoMultimediale);
    }

    public List<ContenutoMultimediale> getContenutiMultimediali() {
        return contenutiMultimediali;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Posizione getPosizione() {
        return posizione;
    }

    public T getTipo() {
        return tipo;
    }

    public String getIdContributore() {
        return idContributore;
    }

    public String getIdComuneAssociato() {
        return idComuneAssociato;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }

    public List<ContenutoMultimediale> getContenutiMultimedialiInPending() {
        return contenutiMultimedialiInPending;
    }

    public List<Evento> getEventiAssociati() {
        return eventiAssociati;
    }
}


