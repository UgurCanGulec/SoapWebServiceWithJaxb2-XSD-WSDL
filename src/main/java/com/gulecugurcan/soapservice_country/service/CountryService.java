package com.gulecugurcan.soapservice_country.service;

import com.gulecugurcan.soapservice_country.repository.CountryRepository;
import com.gulecugurcan.soapwebservice.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    CountryRepository countryRepository;

    public Country getCountryInfo(String countryName) {
        return countryRepository.getCountryByName(countryName);
    }

}
