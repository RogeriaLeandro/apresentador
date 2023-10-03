package br.mil.defesa.interc2.mq.service;

import br.mil.defesa.interc2.apresentador.MessageDTO;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;

public class ListenerService {

    @Autowired
    public MessageDTO messageDTO;

    public String montaJsonMessageDTO(MessageDTO messageDTO) {

        String json = new Gson().toJson(messageDTO.toString());
        return json;
    }


}
