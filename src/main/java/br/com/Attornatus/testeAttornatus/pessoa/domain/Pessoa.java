package br.com.Attornatus.testeAttornatus.pessoa.domain;

import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idPessoa;
    @NotBlank
    private String nomeCompleto;
    @NotNull
    private LocalDate dataNascimento;
    @NotBlank
    private Endereco endereco;

    public Pessoa(String nomeCompleto, LocalDate dataNascimento, Endereco endereco) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}
