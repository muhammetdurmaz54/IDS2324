package it.unicam.cs.repository;


import it.unicam.cs.model.Comune;
import it.unicam.cs.model.POI;
import it.unicam.cs.repository.Interfaces.IPOIRepository;

import java.util.Map;
import java.util.stream.Collectors;

public class POIRepositoryImpl implements IPOIRepository {

    private final Map<Integer, POI> pois;

    public POIRepositoryImpl(Comune comune, Map<Integer, POI> pois) {
        this.pois = pois;
    }

    public Map<Integer, POI> ottieniPOIS(int idComune) {
        return pois.values()
                .stream()
                .filter(poi -> poi.getIdComuneAssociato() == idComune)
                .collect(Collectors.toMap(POI::getId, poi-> poi));
    }

    public POI ottieniPOIdaID(int idPOI){
            return pois.get(idPOI);
        }

    @Override
    public void aggiungiPOI(POI poi) {

    }

    @Override
    public void aggiungiPOIInPending(POI poi) {

    }

}
