package se.kth.id1212.heimlen.currencyconverter.currencyconverter.integration;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.Model.Currency;

import java.util.List;

@Repository
public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

    Currency findByName(String name);
    Currency findById(int id);

}
