package br.com.Attornatus.testeAttornatus.endereco.application.api;

import jakarta.validation.Valid;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/pessoa/{idPessoa}/endereco")
public interface EnderecoAPI  {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    EnderecoResponse postEndereco (@PathVariable UUID idPessoa, @Valid @RequestBody EnderecoRequest enderecoRequest);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<EnderecoPessoaListResponse> getEnderecosPessoaComId(@PathVariable UUID idPessoa);

    @GetMapping(value = "{idEndereco}")
    @ResponseStatus(code = HttpStatus.OK)
    EnderecoPessoaDetalheResponse getEnderecoPessoaComId(@PathVariable UUID idPessoa, @PathVariable UUID idEndereco);

    @DeleteMapping(value = "{idEndereco}")
    @ResponseStatus (code = HttpStatus.NO_CONTENT)
    void deleteEnderecoPessoa (@PathVariable UUID idPessoa, @PathVariable UUID idEndereco);

    @PatchMapping (value = "{idEndereco}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    EnderecoResponse patchEnderecoPessoaComId(@PathVariable UUID idPessoa, @PathVariable UUID idEndereco, @Valid @RequestBody EnderecoAlteracaoRequest enderecoAlteracaoRequest);
}

