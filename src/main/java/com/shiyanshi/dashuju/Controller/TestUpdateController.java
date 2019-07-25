package com.shiyanshi.dashuju.Controller;


import com.shiyanshi.dashuju.Pojo.Equipment_type;
import com.shiyanshi.dashuju.Seriver.TestUpdateSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class TestUpdateController {

    @Autowired
    private TestUpdateSeriver testUpdateSeriver;

    @RequestMapping(value = "/update",method = RequestMethod.POST)
     public void  Update(Equipment_type type)
     {

            this.testUpdateSeriver.Updatemessage(type);
     }

     @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void insert(Equipment_type type)
     {
     this.testUpdateSeriver.insertmessage(type);
     }

    @RequestMapping(value = "/delete",method =RequestMethod.POST)
    public void delete(Equipment_type type)
    {
        this.testUpdateSeriver.deletemessage(type);
    }
}

