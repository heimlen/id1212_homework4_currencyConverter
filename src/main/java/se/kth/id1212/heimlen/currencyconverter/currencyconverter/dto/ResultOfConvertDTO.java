package se.kth.id1212.heimlen.currencyconverter.currencyconverter.dto;

import se.kth.id1212.heimlen.currencyconverter.currencyconverter.Model.Currency;

public class ResultOfConvertDTO {

    private RequestToConvertDTO request;
    private String resultedAmount;

    public ResultOfConvertDTO(RequestToConvertDTO request, String resultedAmount) {
        this.request = request;
        this.resultedAmount = resultedAmount;
    }

    public RequestToConvertDTO getRequest() {
        return request;
    }

    public void setRequest(RequestToConvertDTO request) {
        this.request = request;
    }

    public String getResultedAmount() {
        return resultedAmount;
    }

    public void setResultedAmount(String resultedAmount) {
        this.resultedAmount = resultedAmount;
    }
}
