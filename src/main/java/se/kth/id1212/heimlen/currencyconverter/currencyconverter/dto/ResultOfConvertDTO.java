package se.kth.id1212.heimlen.currencyconverter.currencyconverter.dto;

import se.kth.id1212.heimlen.currencyconverter.currencyconverter.Model.Currency;

public class ResultOfConvertDTO {

    RequestToConvertDTO request;
    private double resultedAmount;

    public ResultOfConvertDTO(RequestToConvertDTO request, double resultedAmount) {
        this.request = request;
        this.resultedAmount = resultedAmount;
    }

    public RequestToConvertDTO getRequest() {
        return request;
    }

    public void setRequest(RequestToConvertDTO request) {
        this.request = request;
    }

    public double getResultedAmount() {
        return resultedAmount;
    }

    public void setResultedAmount(double resultedAmount) {
        this.resultedAmount = resultedAmount;
    }
}
