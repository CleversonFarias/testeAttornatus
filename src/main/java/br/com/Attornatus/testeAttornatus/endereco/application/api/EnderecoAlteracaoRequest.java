package br.com.Attornatus.testeAttornatus.endereco.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class EnderecoAlteracaoRequest {
    @NotBlank
    private String logradouro;
    @NotBlank
    private String cep;
    @NotBlank
    private String numero;
    @NotBlank
    private String cidade;
}
