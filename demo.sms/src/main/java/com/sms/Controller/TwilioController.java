package com.sms.Controller;

import com.sms.payload.SmsRequest;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/sms")
    public class TwilioController {

        @Value("${twilio.phone.number}")
        private String twilioPhoneNumber;



//http://locahost:8080/api/sms/send
        @PostMapping("/send")
        public String sendSMS(@RequestBody SmsRequest smsRequest) {

            try {
                Message message = Message.creator(
                                new PhoneNumber(smsRequest.getTo()),
                                new PhoneNumber(twilioPhoneNumber),
                                smsRequest.getMessage())
                        .create();
                return message.getSid();
            } catch (Exception e) {
                return e.getMessage();
            }
        }
    }















