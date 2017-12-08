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

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public List<Currency> getAllCurrencies() {
        List<Currency> currencies = new ArrayList<>();
        currencyRepository.findAll().forEach(currencies::add);
        return currencies;
    }

    public ResultOfConvertDTO Convert(RequestToConvertDTO requestToConvertDTO) {
        double result = (requestToConvertDTO.getRequestedAmount() *
                requestToConvertDTO.getCurrencyFrom().getConversionRate() / requestToConvertDTO.getCurrencyTo().getConversionRate());
        DecimalFormat formatter = new DecimalFormat("#.00");
        return new ResultOfConvertDTO(requestToConvertDTO, formatter.format(result));
    }
}
