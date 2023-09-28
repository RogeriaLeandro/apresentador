package br.mil.defesa.interc2.mdlp.apresentador.listener;

import br.mil.defesa.interc2.mdlp.apresentador.model.Message;
import br.mil.defesa.interc2.mdlp.apresentador.model.TipoMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerMessage {

    private Logger logger = LoggerFactory.getLogger(ListenerMessage.class);

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void receiveMessage(Message message) {

        if (message.getTipoMessage().equals(TipoMessage.ESTRATEGICO)) {

        }

        if (message.getTipoMessage().equals(TipoMessage.TATICO)) {

        }

        //TODO Ver se há algum tratamento diferente para MessageEstrategico e MessageTatico
        logger.info("Mensagem enviada");
    }


}
