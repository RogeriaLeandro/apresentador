package br.mil.defesa.interc2.apresentador;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class MessageDTO {

    private String latitude;
    private String longitude;
    private String id;
    private String sidc;
    private TipoMDLP tipoMDLP;

}
