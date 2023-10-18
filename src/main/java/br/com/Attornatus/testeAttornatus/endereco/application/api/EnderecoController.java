package br.com.Attornatus.testeAttornatus.endereco.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

    @Override
    public List<EnderecoPessoaListResponse> getEnderecosPessoaComId(UUID idPessoa) {
        log.info("[inicia] EnderecoController - getEnderecosPessoaComId");
        log.info("[idPessoa] {}", idPessoa);
        List<EnderecoPessoaListResponse> enderecoPessoaList = enderecoService.buscaEnderecoPessoaComId(idPessoa);
        log.info("[finaliza] EnderecoController - getEnderecosPessoaComId");
        return enderecoPessoaList ;
    }
}
