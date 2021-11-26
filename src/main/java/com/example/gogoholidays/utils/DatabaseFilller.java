package com.example.gogoholidays.utils;

import com.example.gogoholidays.models.entity.*;
import com.example.gogoholidays.repository.*;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.function.LongToIntFunction;

@Component
public class DatabaseFilller implements InitializingBean {
    private final OffreRepository offreRepository;
    private final TransportRepository transRepository;
    private final TrajetRepository trajetRepository;
    private final AdresseRepository adresseRepository;
    private final DestinationRepository destinationRepository;

    public DatabaseFilller(OffreRepository repository, TransportRepository transRepository, TrajetRepository trajetRepository, AdresseRepository adresseRepository, DestinationRepository destinationRepository) {
        this.offreRepository = repository;
        this.transRepository = transRepository;
        this.trajetRepository = trajetRepository;
        this.adresseRepository = adresseRepository;
        this.destinationRepository = destinationRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        /*saveTransport();
        Offre o=saveOffre();
        saveAdresse();
        saveDestination(o,adresseRepository.getById(1));
        saveDestination(o,adresseRepository.getById(2));
        saveDestination(o,adresseRepository.getById(3));

        saveTrajet(1, destinationRepository.getById(1), destinationRepository.getById(2) );
        saveTrajet(2, destinationRepository.getById(2), destinationRepository.getById(3) );

        o=saveOffre();
        saveDestination(o,adresseRepository.getById(4));
        saveDestination(o,adresseRepository.getById(5));

        saveTrajet(1, destinationRepository.getById(4), destinationRepository.getById(5) );*/



    }
    private void saveAdresse(){
        Adresse a=new Adresse();
        a.setPays("Belgique");
        a.setRue("Nom rue");
        a.setNumero(5);
        a.setVille("Libramont");
        adresseRepository.save(a);
        a=new Adresse();
        a.setPays("Belgique");
        a.setRue("Nom rue");
        a.setNumero(5);
        a.setVille("Namur");
        adresseRepository.save(a);
        a=new Adresse();
        a.setPays("Belgique");
        a.setRue("Nom rue");
        a.setNumero(5);
        a.setVille("Bruxelle");
        adresseRepository.save(a);
        a=new Adresse();
        a.setPays("Espage");
        a.setRue("Nom rue");
        a.setNumero(5);
        a.setVille("Salou");
        adresseRepository.save(a);
        a=new Adresse();
        a.setPays("Espagne");
        a.setRue("Nom rue");
        a.setNumero(5);
        a.setVille("Malaga");
        adresseRepository.save(a);

    }
    private Offre saveOffre() {
        Offre offre=new Offre();
        offre.setTitre("voyage Salou-Madrid");
        offre.setType(TypeOffre.CIRCUIT);
        offre.setPrix(1500);
        offre.setNbplacetotal(50);
        offreRepository.save(offre);
        return offre;

    }
    private void saveDestination(Offre offre,Adresse a){
        Destination d=new Destination();
        d.setDestination(offre);
        d.setDateDepart(LocalDate.now());
        d.setDateArrive(LocalDate.now());
        d.setNormeCovid("https://www.info-coronavirus.be/fr/news/");
        d.setAdresseDestination(a);
        destinationRepository.save(d);


    }
    private void saveTrajet(int num,Destination depart,Destination arrive){
        Trajet t=new Trajet();
        Transport transport=transRepository.getById(num);
        t.setDepart(depart);
        t.setArrive(arrive);
        t.setTransport(transport);
        trajetRepository.save(t);
    }
    private void saveTransport(){
        Transport t=new Transport();
        t.setNom("Bus");
        transRepository.save(t);

        t=new Transport();
        t.setNom("Avion");
        transRepository.save(t);

        t=new Transport();
        t.setNom("train");
        transRepository.save(t);

        t=new Transport();
        t.setNom("croisière");
        transRepository.save(t);

    }
}
