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
        List<EnderecoPessoaListResponse> enderecosPessoaList = enderecoService.buscaEnderecosPessoaComId(idPessoa);
        log.info("[finaliza] EnderecoController - getEnderecosPessoaComId");
        return enderecosPessoaList ;
    }

    @Override
    public EnderecoPessoaDetalheResponse getEnderecoPessoaComId(UUID idPessoa, UUID idEndereco) {
        log.info("[inicia] EnderecoController - getEnderecoPessoaComId");
        log.info("[idPessoa] {} - [idEndereco] {}", idPessoa, idEndereco);
        EnderecoPessoaDetalheResponse enderecoPessoa = enderecoService.buscaEnderecoPessoaComId(idPessoa, idEndereco);
        log.info("[finaliza] EnderecoController - getEnderecoPessoaComId");
        return enderecoPessoa;
    }

    @Override
    public void deleteEnderecoPessoa(UUID idPessoa, UUID idEndereco) {
        log.info("[inicia] EnderecoController - deleteEnderecoPessoa");
        log.info("[idPessoa] {} - [idEndereco] {}", idPessoa, idEndereco);
        enderecoService.deleteEnderecoPessoaAtravesId(idPessoa, idEndereco);
        log.info("[finaliza] EnderecoController - deleteEnderecoPessoa");
    }

    @Override
    public EnderecoResponse patchEnderecoPessoaComId(UUID idPessoa, UUID idEndereco, EnderecoAlteracaoRequest enderecoAlteracaoRequest) {
        log.info("[inicia] EnderecoController - patchEnderecoPessoaComId");
        log.info("[idPessoa] {}", idPessoa);
        log.info("[finaliza] EnderecoController - patchEnderecoPessoaComId");
        return null;
    }
}
