package br.com.Attornatus.testeAttornatus.endereco.application.api;

import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest);
}
