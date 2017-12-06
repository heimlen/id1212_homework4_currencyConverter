package se.kth.id1212.heimlen.currencyconverter.currencyconverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.Model.Currency;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.integration.CurrencyService;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private CurrencyService currencyService;


    @RequestMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/currencies")
    public List<Currency> getAllCurrencies() {
       return currencyService.getAllCurrencies();
    }
}
