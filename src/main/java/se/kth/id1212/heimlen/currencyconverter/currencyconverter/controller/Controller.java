package se.kth.id1212.heimlen.currencyconverter.currencyconverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.entity.Currency;
import dto.RequestToConvertDTO;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.service.CurrencyService;

import java.util.List;



@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private CurrencyService currencyService;


    @GetMapping("/")
    public String getIndex(Model model) {
        List<Currency> currencies = currencyService.getAllCurrencies();
        model.addAttribute("currencies", currencies);
        model.addAttribute("requestToConvert", new RequestToConvertDTO());
        return "index";
    }

    @PostMapping("/")
    public String submitConvertRequest(RequestToConvertDTO requestToConvertDTO, Model model) {
        model.addAttribute("resultOfConvert", currencyService.Convert(requestToConvertDTO));
        return getIndex(model);
    }
}
