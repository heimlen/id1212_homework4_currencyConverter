package se.kth.id1212.heimlen.currencyconverter.currencyconverter.integration;

import org.springframework.data.repository.CrudRepository;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.Model.Currency;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

}
