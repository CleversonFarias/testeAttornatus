package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import br.com.Attornatus.testeAttornatus.pessoa.domain.Pessoa;
import lombok.Value;

import java.util.UUID;

@Value
public class PessoaDetalhadaResponse {
    private UUID idPessoa;
    private String nomeCompleto;

    public PessoaDetalhadaResponse(Pessoa pessoa) {
        this.idPessoa = pessoa.getIdPessoa();
        this.nomeCompleto = pessoa.getNomeCompleto();
    }
}
