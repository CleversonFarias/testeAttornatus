package br.com.Attornatus.testeAttornatus.pessoa.application.service;

import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaListResponse;
import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaRequest;
import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaResponse;

import java.util.List;

public interface PessoaService {
    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);
    List<PessoaListResponse> listaTodasPessoas();
}
