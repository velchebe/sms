package com.example.SwizzSoft_Sms_app.Contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repository;

    public Contact getContact(){
        return (Contact) repository.findAll();
    }
    public Contact contactSave(Contact req){
        return repository.save(req);
    }
}
