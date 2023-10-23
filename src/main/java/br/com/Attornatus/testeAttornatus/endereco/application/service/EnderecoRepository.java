package br.com.Attornatus.testeAttornatus.endereco.application.service;

import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;

import java.util.List;
import java.util.UUID;

public interface EnderecoRepository {
    Endereco salvaEndereco(Endereco endereco);
    List<Endereco> buscaEnderecosPessoaComId(UUID idPessoa);
    Endereco buscaEnderecoPessoaComId(UUID idEndereco);
    void deletaEndereco(Endereco endereco);
}
