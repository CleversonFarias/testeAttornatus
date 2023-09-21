package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import br.com.Attornatus.testeAttornatus.pessoa.application.service.PessoaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
             //       pessoaListService.listaTodas
        log.info("[finaliza] PessoaController - List<PessoaListResponse>");
        return null;
    }
}
