package se.kth.id1212.heimlen.currencyconverter.currencyconverter.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Applications model of the database table Currency.
 */
@Entity
public class Currency {

    @Id
    private int id;

    @Column(nullable = false)
    private String currencyName;

    @Column(nullable = false)
    private double currencyRate;

    public Currency() {
    }

    public Currency(int id, String currencyName, double currencyRate) {
        this.id = id;
        this.currencyName = currencyName;
        this.currencyRate = currencyRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(double currencyRate) {
        this.currencyRate = currencyRate;
    }
}
