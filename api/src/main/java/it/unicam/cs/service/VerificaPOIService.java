package it.unicam.cs.service;

import it.unicam.cs.repository.POIRepositoryImpl;
import it.unicam.cs.service.Abstractions.AbstractVerificaContenutoService;
import it.unicam.cs.util.Posizione;

public class VerificaPOIService extends AbstractVerificaContenutoService {
    public VerificaPOIService(AbstractContenutoRepository abstractContenutoRepository) {
        super(abstractContenutoRepository);
    }
    public void verificaCoordinate(Posizione posizione){
        ((POIRepositoryImpl)this.abstractContenutoRepository).getComune().verificaCoordinate(posizione);
    }
}
