package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/pessoa")
public interface PessoaAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PessoaResponse postPessoa(PessoaRequest pessoaRequest);

}
