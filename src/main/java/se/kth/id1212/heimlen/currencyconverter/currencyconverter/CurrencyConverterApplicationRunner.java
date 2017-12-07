package se.kth.id1212.heimlen.currencyconverter.currencyconverter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.Model.Currency;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.integration.CurrencyRepository;

@Component
public class CurrencyConverterApplicationRunner implements ApplicationRunner {

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        currencyRepository.save(new Currency(1, "Krona SEK", 1));
        currencyRepository.save(new Currency(2, "Euro EUR", 9.94889));
        currencyRepository.save(new Currency(3, "US Dollar USD", 8.44153));
        currencyRepository.save(new Currency(4, "British Pound GBP", 11.3161));
        currencyRepository.save(new Currency(5, "Australian Dollar AUD", 6.35749));
        currencyRepository.save(new Currency(6, "Indian Rupee INR", 0.130681));
    }
}
