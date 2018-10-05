package ar.com.bateriasroca.brspringwebapp.repositories;

import ar.com.bateriasroca.brspringwebapp.model.Offer;
import org.springframework.data.repository.CrudRepository;

public interface OfferRepository extends CrudRepository<Offer, Long> {
}
