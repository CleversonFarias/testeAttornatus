package br.com.Attornatus.testeAttornatus.pessoa.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;

@Value
public class PessoaAlteracaoRequest {
    @NotBlank
    private String nomeCompleto;
    @NotNull
    private LocalDate dataNascimento;
}
