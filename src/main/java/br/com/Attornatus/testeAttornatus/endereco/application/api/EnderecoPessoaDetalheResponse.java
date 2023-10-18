package br.com.Attornatus.testeAttornatus.endereco.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.util.UUID;
@Value
public class EnderecoPessoaDetalheResponse {
    private UUID idEndereco;
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;

}
