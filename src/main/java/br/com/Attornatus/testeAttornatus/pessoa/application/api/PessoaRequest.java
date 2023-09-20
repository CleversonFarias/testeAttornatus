package br.com.Attornatus.testeAttornatus.pessoa.application.api;

//import br.com.Attornatus.testeAttornatus.pessoa.domain.Endereco;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.time.LocalDate;
@Value
public class PessoaRequest {
    @NotBlank
    private String nomeCompleto;
    @NotNull
    private LocalDate dataNascimento;
   // @NotBlank
  //  private Endereco endereco;

}
