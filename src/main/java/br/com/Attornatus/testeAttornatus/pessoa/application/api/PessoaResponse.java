package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;


@Builder
@Value
public class PessoaResponse {
    private UUID idPessoa;

}
