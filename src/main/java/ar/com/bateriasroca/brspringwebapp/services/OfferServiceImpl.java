package ar.com.bateriasroca.brspringwebapp.services;

import ar.com.bateriasroca.brspringwebapp.model.Offer;
import ar.com.bateriasroca.brspringwebapp.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OfferServiceImpl implements OfferService {

    private OfferRepository offerRepository;

    @Autowired
    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public Iterable<Offer> getAllOffers() {
        return offerRepository.findAll();
    }
}
