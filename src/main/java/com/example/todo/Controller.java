package com.example.todo;

import org.springframework.web.bind.annotation.CrossOrigin; // Importação necessária
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200") // ESTA É A LINHA QUE LIBERA O ANGULAR
public class Controller {

    private final AtividadeService serv;

    public Controller(AtividadeService serv) {
        this.serv = serv;
    }

    @GetMapping
    public List<Atividade> listarTudo() {
        return serv.listar();
    }
}