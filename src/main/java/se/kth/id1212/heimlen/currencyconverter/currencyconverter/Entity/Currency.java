package se.kth.id1212.heimlen.currencyconverter.currencyconverter.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Applications model of the database table Currency.
 */
@Entity
public class Currency {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double conversionRate;

    public Currency() {
    }

    public Currency(int id, String name, double conversionRate) {
        this.id = id;
        this.name = name;
        this.conversionRate = conversionRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }
}
