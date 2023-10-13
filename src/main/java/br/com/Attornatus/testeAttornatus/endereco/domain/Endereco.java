package br.com.Attornatus.testeAttornatus.endereco.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Getter
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "idEndereco", updatable = false, unique = true, nullable = false)
    private UUID idEndereco;
    @NotBlank
    private String logradouro;
    @NotBlank
    private String cep;
    private String numero;
    @NotBlank
    private String cidade;
}
