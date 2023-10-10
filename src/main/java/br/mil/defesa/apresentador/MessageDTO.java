package br.mil.defesa.apresentador;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class MessageDTO {

    private String latitude;
    private String longitude;
    private String id;
    private String sidc;
    private TipoMDLP tipoMDLP;

}
