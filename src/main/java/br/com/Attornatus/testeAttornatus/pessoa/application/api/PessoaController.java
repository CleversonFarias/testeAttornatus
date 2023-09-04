package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class PessoaController implements PessoaAPI {

    @Override
    public PessoaResponse postPessoa(PessoaRequest pessoaRequest) {
       log.info("[inicia] PessoaController - postPessoa");
       log.info("[finaliza] PessoaController - postPessoa");
       return null;
    }
}
