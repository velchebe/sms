package com.example.SwizzSoft_Sms_app.Contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping("contact")
    public Contact getContact(){
        return service.getContact();
    }
    @PostMapping("details")
    public Contact getContact(@RequestBody Contact req){
        return service.contactSave(req);
    }
}
