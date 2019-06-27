/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soap.trial.soaptrial;

import com.baeldung.springsoap.gen.Country;
import com.baeldung.springsoap.gen.Currency;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

/**
 *
 * @author nyakundid
 */
@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        //initialize countries
        Country kenya = new Country();
        kenya.setCapital("Nairobi");
        kenya.setCurrency(Currency.KES);
        kenya.setName("KENYA");
        kenya.setPopulation(50000000);

        Country australia = new Country();
        australia.setName("AUSTRALIA");
        australia.setCapital("syndey");
        australia.setCurrency(Currency.AUD);
        australia.setPopulation(25700000);

        Country nzd = new Country();
        nzd.setName("New Zealand");
        nzd.setCapital("Wellington");
        nzd.setCurrency(Currency.NZD);
        nzd.setPopulation(4700000);

        Country uk = new Country();
        uk.setName("Great Britain");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(67000000);

        Country po = new Country();
        po.setName("Poland");
        po.setCapital("Warsaw");
        po.setCurrency(Currency.EUR);
        po.setPopulation(38000000);

        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46000000);

        countries.put(kenya.getName(), kenya);
        countries.put(australia.getName(), australia);
        countries.put(nzd.getName(), nzd);
        countries.put(uk.getName(), uk);
        countries.put(po.getName(), po);
        countries.put(spain.getName(), spain);
        
    }

    public Country findCountry(String name) {

        return countries.get(name);
    }
}
