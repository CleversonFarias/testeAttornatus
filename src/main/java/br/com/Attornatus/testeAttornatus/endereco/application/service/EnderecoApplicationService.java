package br.com.Attornatus.testeAttornatus.endereco.application.service;

import br.com.Attornatus.testeAttornatus.endereco.application.api.EnderecoRequest;
import br.com.Attornatus.testeAttornatus.endereco.application.api.EnderecoResponse;
import br.com.Attornatus.testeAttornatus.endereco.application.api.EnderecoService;
import br.com.Attornatus.testeAttornatus.endereco.application.repository.EnderecoRepository;
import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;
import br.com.Attornatus.testeAttornatus.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class EnderecoApplicationService implements EnderecoService {
    private final PessoaService pessoaService;
    private final EnderecoRepository enderecoRepository;

    @Override
    public EnderecoResponse criaEndereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        log.info("[inicia] EnderecoApplicationService - criaEndereco");
        pessoaService.buscaPessoaPeloId(idPessoa);
        log.info("[idPessoa] {}", idPessoa);
        Endereco endereco = enderecoRepository.salvaEndereco(new Endereco(idPessoa, enderecoRequest));
        log.info("[finaliza] EnderecoApplicationService - criaEndereco");
        return new EnderecoResponse(endereco.getIdEndereco());
    }
}
