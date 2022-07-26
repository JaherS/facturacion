package com.facturacion.modelcore.dto.persona;

import com.facturacion.modelcore.entities.ciudad.CiudadDAO;
import com.facturacion.modelcore.entities.tipoDocumento.TipoDocumentoDAO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"PERSONA_ID", "PERSONA_DOCUMENTO", "PERSONA_NOMBRES", "PERSONA_APELLIDOS", "PERSONA_TELEFONO", "PERSONA_CORREO", "PERSONA_DIRECCION",
                    "PERSONA_FECHANACIMIENTO", "CIUDAD", "TIPODOC_ID"})
public class PersonaDTO {

    private Long personaId;

    @NotNull(message = "El documento de la persona es requerido")
    private Long personaDocumento;

    @NotNull(message = "Los Nombres son requeridos")
    private String personaNombres;

    @NotNull(message = "Los Apellidos son requeridos")
    private String personaApellidos;

    @NotNull(message = "El telefono es requerido")
    private String personaTelefono;

    @NotNull(message = "El correo es requerido")
    private String personaCorreo;

    @NotNull(message = "La direccion es requerida")
    private String personaDireccion;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "La fecha de nacimiento es requerida")
    private Date fechaNacimiento;

    @NotNull(message = "Seleccione una ciudad")
    private CiudadDAO ciudad;

    @NotNull(message = "Seleccion un tipo de documento")
    private TipoDocumentoDAO tipoDocumento;


}
