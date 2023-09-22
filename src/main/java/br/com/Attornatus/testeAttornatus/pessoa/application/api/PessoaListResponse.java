package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import br.com.Attornatus.testeAttornatus.pessoa.domain.Pessoa;

import java.util.List;
import java.util.UUID;

public class PessoaListResponse {
    private UUID idPessoa;
    private String nomeCompleto;

    public static List<PessoaListResponse> convert(List<Pessoa> pessoas) {
       
        return null;
    }
}
