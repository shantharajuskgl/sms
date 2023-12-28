package com.sms.Configuration;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.context.annotation.Configuration;

import com.twilio.Twilio;

    @Configuration
    public class TwilioConfig {

        @Value("${twilio.account.sid}")
        private String accountSid;

        @Value("${twilio.auth.token}")
        private String authToken;

        @Value("${twilio.phoneNumber}")
        private String twilioPhoneNumber;



    }








































