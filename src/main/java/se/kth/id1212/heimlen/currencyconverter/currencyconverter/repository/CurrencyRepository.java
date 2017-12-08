package se.kth.id1212.heimlen.currencyconverter.currencyconverter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.entity.Currency;

/**
 * Handles all interaction with the Spring Data JPA, which in turn means handling all interaction with the db,
 */

@Repository
public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

    Currency findByName(String name);
    Currency findById(int id);

}
