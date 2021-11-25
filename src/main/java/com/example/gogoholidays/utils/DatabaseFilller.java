package com.example.gogoholidays.utils;

import com.example.gogoholidays.models.entity.Offre;
import com.example.gogoholidays.models.entity.TypeOffre;
import com.example.gogoholidays.repository.OffreRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFilller implements InitializingBean {
    private final OffreRepository offreRepository;

    public DatabaseFilller(OffreRepository repository) {
        this.offreRepository = repository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        saveOffre();
    }

    private void saveOffre() {
        Offre offre=new Offre();
        offre.setTitre("voyage Salou-Madrid");
        offre.setType(TypeOffre.CIRCUIT);
        offre.setPrix(1500);
        offre.setNbplacetotal(50);
        offreRepository.save(offre);
    }
}
