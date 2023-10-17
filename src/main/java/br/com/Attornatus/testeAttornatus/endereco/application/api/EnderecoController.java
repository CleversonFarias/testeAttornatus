package br.com.Attornatus.testeAttornatus.endereco.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Log4j2
@RestController
@RequiredArgsConstructor
public class EnderecoController implements EnderecoAPI {

    private final EnderecoService enderecoService;

    @Override
    public EnderecoResponse postEndereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoController - postEndereco");
        log.info("[idPessoa] {}", idPessoa);
        EnderecoResponse endereco = enderecoService.criaEndereco(idPessoa, enderecoRequest);
        log.info("[finaliza] EnderecoController - postEndereco");
        return endereco;
    }
}
