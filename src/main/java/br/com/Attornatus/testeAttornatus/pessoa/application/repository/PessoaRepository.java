package br.com.Attornatus.testeAttornatus.pessoa.application.repository;

import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaListResponse;
import br.com.Attornatus.testeAttornatus.pessoa.domain.Pessoa;

import java.util.List;

public interface PessoaRepository {
    Pessoa salva(Pessoa pessoa);
    List<Pessoa> listaTodasPessoas();
}
