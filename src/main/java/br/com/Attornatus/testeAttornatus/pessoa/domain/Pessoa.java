package br.com.Attornatus.testeAttornatus.pessoa.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Pessoa {
    @Id
    private UUID idPessoa;
    @NotBlank
    private String nomeCompleto;
    @NotNull
    private LocalDate dataNascimento;
    @NotBlank
    private String endereço;

    public Pessoa(String nomeCompleto, LocalDate dataNascimento, String endereço, UUID idPessoa) {
        this.idPessoa = UUID.randomUUID();
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
    }
}
