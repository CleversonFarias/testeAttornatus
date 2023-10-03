package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/pessoa")
public interface PessoaAPI {
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PessoaResponse postPessoa(@Valid @RequestBody PessoaRequest pessoaRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<PessoaListResponse> getTodasPessoas();

    @GetMapping(value = "/{idPessoa}")
    @ResponseStatus(code = HttpStatus.OK)
    PessoaDetalhadaResponse getPessoaAtravesId (@PathVariable UUID idPessoa);
}
