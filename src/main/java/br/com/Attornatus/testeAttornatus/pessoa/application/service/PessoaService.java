package br.com.Attornatus.testeAttornatus.pessoa.application.service;

import br.com.Attornatus.testeAttornatus.pessoa.application.api.*;

import java.util.List;
import java.util.UUID;

public interface PessoaService {
    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);
    List<PessoaListResponse> listaTodasPessoas();
    PessoaDetalhadaResponse buscaPessoaPeloId(UUID idPessoa);
    void deletaPessoaPeloId(UUID idPessoa);
    void alteraPessoaAtravesId(UUID idPessoa, PessoaAlteracaoRequest pessoaAlteracaoRequest);
}
