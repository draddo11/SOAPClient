package com.example.springsoapwsclient;

import com.example.springsoapwsclient.client.SoapClient;
import com.example.springsoapwsclient.loaneligblitiy.Acknowledgement;
import com.example.springsoapwsclient.loaneligblitiy.CustomerRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SoapclientWsApplication {
    @Autowired
    private SoapClient client;

    @PostMapping("/getLoanStatus")
    public Acknowledgement invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
        return client.getLoanStatus(request);
    }
    public static void main(String[] args) {
        SpringApplication.run(SoapclientWsApplication.class, args);
    }

}
