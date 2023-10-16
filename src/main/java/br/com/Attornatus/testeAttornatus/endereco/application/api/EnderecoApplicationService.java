package br.com.Attornatus.testeAttornatus.endereco.application.api;

import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Log4j2
public class EnderecoApplicationService implements EnderecoService {
    @Override
    public EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoApplicationService - criaEndereco");
        Endereco endereco = enderecoRepository.criaEndereco(idPessoa, enderecoRequest);
        log.info("[finaliza] EnderecoApplicationService - criaEndereco");
        return null;
    }
}
