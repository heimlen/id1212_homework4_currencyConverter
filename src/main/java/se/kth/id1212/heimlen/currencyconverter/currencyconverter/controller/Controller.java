package se.kth.id1212.heimlen.currencyconverter.currencyconverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.entity.Currency;
import dto.RequestToConvertDTO;
import se.kth.id1212.heimlen.currencyconverter.currencyconverter.service.CurrencyService;

import java.util.List;

/**
 * Responsible for processing user requests and building an appropriate model and passing it to the view for rendering
 */

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private CurrencyService currencyService;

    /**
     * This method is used when a get request is sent to the / (root) page of the application.
     * @param model represents the data that will be passed to the view
     * @return the index.html page
     */

    @GetMapping("/")
    public String getIndex(Model model) {
        List<Currency> currencies = currencyService.getAllCurrencies();
        model.addAttribute("currencies", currencies);
        model.addAttribute("requestToConvert", new RequestToConvertDTO());
        return "index";
    }

    /**
     * This method is used when a post request is sent to the / (root) page of the application.
     * @param requestToConvertDTO a DTO containing the user data entered at the / page
     * @param model represents the data that will be passed to the view
     * @return a new index page, containing the result of the conversion added on line 45.
     */
    @PostMapping("/")
    public String submitConvertRequest(RequestToConvertDTO requestToConvertDTO, Model model) {
        model.addAttribute("resultOfConvert", currencyService.Convert(requestToConvertDTO));
        return getIndex(model);
    }
}
