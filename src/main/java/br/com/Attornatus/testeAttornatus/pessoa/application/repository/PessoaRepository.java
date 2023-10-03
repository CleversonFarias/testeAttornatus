package br.com.Attornatus.testeAttornatus.pessoa.application.repository;

import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaDetalhadaResponse;
import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaListResponse;
import br.com.Attornatus.testeAttornatus.pessoa.domain.Pessoa;

import java.util.List;
import java.util.UUID;

public interface PessoaRepository {
    Pessoa salva(Pessoa pessoa);
    List<Pessoa> listaTodasPessoas();
    PessoaDetalhadaResponse buscaPessoaAtravesId(UUID idPessoa);
}
