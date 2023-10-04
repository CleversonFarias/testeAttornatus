package br.com.Attornatus.testeAttornatus.pessoa.application.repository;

import br.com.Attornatus.testeAttornatus.pessoa.domain.Pessoa;

import java.util.List;
import java.util.UUID;

public interface PessoaRepository {
    Pessoa salva(Pessoa pessoa);
    List<Pessoa> listaTodasPessoas();
    Pessoa buscaPessoaAtravesId(UUID idPessoa);
}
