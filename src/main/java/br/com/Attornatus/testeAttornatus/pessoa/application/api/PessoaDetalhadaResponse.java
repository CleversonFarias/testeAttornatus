package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import lombok.Value;

import java.util.UUID;
@Value
public class PessoaDetalhadaResponse {
    private UUID idPessoa;
    private String nomeCompleto;
}
