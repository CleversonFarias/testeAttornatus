package br.com.Attornatus.testeAttornatus.endereco.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.util.UUID;
@Value
public class EnderecoRequest {
    @NotBlank
    private String logradouro;
    @NotBlank
    private String cep;
    private String Número;
    @NotBlank
    private String cidade;
}
