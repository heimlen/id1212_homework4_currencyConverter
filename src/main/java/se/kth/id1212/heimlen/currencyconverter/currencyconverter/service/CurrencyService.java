package se.kth.id1212.heimlen.currencyconverter.currencyconverter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.entity.Currency;
import dto.RequestToConvertDTO;
import dto.ResultOfConvertDTO;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.repository.CurrencyRepository;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains all business logic of the application
 */

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    /**
     * Returns a list of all currencies currently in the db.
     * @return list of currencies found in db.
     */
    public List<Currency> getAllCurrencies() {
        List<Currency> currencies = new ArrayList<>();
        currencyRepository.findAll().forEach(currencies::add);
        return currencies;
    }

    /**
     * Contains the logic to convert a given amount of one currency to another currency
     * @param requestToConvertDTO a DTO containing the two currencies and the amount to convert
     * @return a new DTO containing the <code>RequestToConvertDTO</code> as well as the formatted converted amount
     */
    public ResultOfConvertDTO Convert(RequestToConvertDTO requestToConvertDTO) {
        double result = (requestToConvertDTO.getRequestedAmount() *
                requestToConvertDTO.getCurrencyFrom().getConversionRate() / requestToConvertDTO.getCurrencyTo().getConversionRate());
        DecimalFormat formatter = new DecimalFormat("#.00");
        return new ResultOfConvertDTO(requestToConvertDTO, formatter.format(result));
    }
}
