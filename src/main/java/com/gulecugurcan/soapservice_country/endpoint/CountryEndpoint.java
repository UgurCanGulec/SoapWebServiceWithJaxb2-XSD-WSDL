package com.gulecugurcan.soapservice_country.endpoint;

import com.gulecugurcan.soapservice_country.service.CountryService;
import com.gulecugurcan.soapwebservice.GetCountryRequest;
import com.gulecugurcan.soapwebservice.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://www.gulecugurcan.com/soapwebservice";
    @Autowired
    CountryService countryService;

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getCountryRequest")
    @ResponsePayload
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request) {
        GetCountryResponse response=new GetCountryResponse();
        response.setCountry(countryService.getCountryInfo(request.getName()));
        return response;
    }

}
