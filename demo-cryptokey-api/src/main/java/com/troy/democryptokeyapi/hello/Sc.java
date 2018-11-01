package com.troy.democryptokeyapi.hello;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Sc {


    private static final Logger log = LoggerFactory.getLogger(Sc.class);


    @Scheduled(fixedRate = 5000)
    public void getResult() {

        RestTemplate restTemplate = new RestTemplate();
        Converter converter = restTemplate.getForObject(
                "https://api.cryptonator.com/api/ticker/btc-usd", Converter.class);
        log.info(converter.toString());
    }
}
