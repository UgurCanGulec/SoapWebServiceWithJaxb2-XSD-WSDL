package com.gulecugurcan.soapservice_country.repository;

import com.gulecugurcan.soapwebservice.Country;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends MongoRepository<Country,String> {
public Country getCountryByName(String countryName);

}
