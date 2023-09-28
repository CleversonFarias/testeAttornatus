package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import br.com.Attornatus.testeAttornatus.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PessoaController implements PessoaAPI {
    private final PessoaService pessoaService;

    @Override
    public PessoaResponse postPessoa(PessoaRequest pessoaRequest) {
       log.info("[inicia] PessoaController - postPessoa");
       PessoaResponse pessoaCriado = pessoaService.criaPessoa(pessoaRequest);
       log.info("[finaliza] PessoaController - postPessoa");
       return pessoaCriado;
    }

    @Override
    public List<PessoaListResponse> getTodasPessoas() {
        log.info("[inicia] PessoaController - List<PessoaListResponse>");
        List<PessoaListResponse> pessoas =  pessoaService.listaTodasPessoas();
        log.info("[finaliza] PessoaController - List<PessoaListResponse>");
        return pessoas;
    }

    @Override
    public PessoaDetalhadaResponse getPessoaAtravesId(UUID idPessoa) {
        log.info("[inicia] PessoaController - getPessoaAtravesId");
        log.info("[idPessoa] {}", idPessoa);
        PessoaDetalhadaResponse pessoa = pessoaService.buscaPessoaPeloId(idPessoa);
        log.info("[finaliza] PessoaController - getPessoaAtravesId");
        return pessoa;

    }
}
