package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeEditor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ meetup", produces = MediaType.APPLICATION_JSON_VALUE)
public class MeetupController {

    //GET (retornar info)
    //POST (gravar)
    //PUT (atualizar)
    //DELETE
    //PATCH (atualizar somente algumas info)

    @Autowired //construir objeto
    PessoaRepository pessoaRepository;

    @GetMapping
    public String helloWord() {
        return "Olá Meetup";
    }

    @GetMapping (value = "/{value}")
    public String hello(@PathVariable String value) {
        return "Olá" + value;
    }

}
