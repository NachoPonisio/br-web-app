package ar.com.bateriasroca.brspringwebapp.repositories;

import ar.com.bateriasroca.brspringwebapp.model.Battery;
import org.springframework.data.repository.CrudRepository;

public interface BatteryRepository extends CrudRepository<Battery, Long> {
}
