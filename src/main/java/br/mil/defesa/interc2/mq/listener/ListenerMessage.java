package br.mil.defesa.interc2.mq.listener;

import br.mil.defesa.interc2.apresentador.MessageDTO;
import br.mil.defesa.interc2.mq.service.ListenerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ListenerMessage {

    private Logger logger = LoggerFactory.getLogger(ListenerMessage.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    public ListenerService listenerService;

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(MessageDTO messageDTO) {

        String json = listenerService.montaJsonMessageDTO(messageDTO);
        rabbitTemplate.convertAndSend(json);

    }



}
