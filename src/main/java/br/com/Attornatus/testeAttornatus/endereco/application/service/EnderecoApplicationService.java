package br.com.Attornatus.testeAttornatus.endereco.application.service;

import br.com.Attornatus.testeAttornatus.endereco.application.api.*;
import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;
import br.com.Attornatus.testeAttornatus.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public List<EnderecoPessoaListResponse> buscaEnderecosPessoaComId(UUID idPessoa) {
        log.info("[inicia] EnderecoApplicationService - buscaEnderecoPessoaComId");
        pessoaService.buscaPessoaPeloId(idPessoa);
        List<Endereco> enderecoDaPessoa = enderecoRepository.buscaEnderecosPessoaComId(idPessoa);
        log.info("[finaliza] EnderecoApplicationService - buscaEnderecoPessoaComId");
        return EnderecoPessoaListResponse.converte(enderecoDaPessoa);
    }

    @Override
    public EnderecoPessoaDetalheResponse buscaEnderecoPessoaComId(UUID idPessoa, UUID idEndereco) {
        log.info("[inicia] EnderecoApplicationService - buscaEnderecoPessoaComId");
        pessoaService.buscaPessoaPeloId(idPessoa);
        Endereco endereco = enderecoRepository.buscaEnderecoPessoaComId(idEndereco);
        log.info("[finaliza] EnderecoApplicationService - buscaEnderecoPessoaComId");
        return new EnderecoPessoaDetalheResponse(endereco);
    }

    @Override
    public void deleteEnderecoPessoaAtravesId(UUID idPessoa, UUID idEndereco) {
        log.info("[inicia] EnderecoApplicationService - deleteEnderecoPessoaAtravesId");
        log.info("[finaliza] EnderecoApplicationService - deleteEnderecoPessoaAtravesId");
    }
}
