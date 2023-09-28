package br.mil.defesa.interc2.mdlp.apresentador.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Message {

    private BigDecimal latitude;
    private BigDecimal longitude;
    private TipoMessage tipoMessage;

}
