package br.mil.defesa.interc2.controller;

import br.mil.defesa.apresentador.MessageDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/apresentador")
public class MdlpApresentadorController {

    @PostMapping
    public ResponseEntity<MessageDTO> postMessageDTO(@RequestBody MessageDTO messageDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(messageDTO);
    }
}
