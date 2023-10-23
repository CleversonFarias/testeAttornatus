package br.com.Attornatus.testeAttornatus.endereco.application.api;

import java.util.List;
import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest);
    List<EnderecoPessoaListResponse> buscaEnderecosPessoaComId(UUID idPessoa);
    EnderecoPessoaDetalheResponse buscaEnderecoPessoaComId(UUID idPessoa, UUID idEndereco);
    void deleteEnderecoPessoaAtravesId(UUID idPessoa, UUID idEndereco);
}
