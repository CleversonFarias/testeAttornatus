package br.com.Attornatus.testeAttornatus.endereco.domain;

import br.com.Attornatus.testeAttornatus.endereco.application.api.EnderecoRequest;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    private UUID idPessoaProprietario;
    @NotBlank
    private String logradouro;
    @NotBlank
    private String cep;
    @NotBlank
    private String numero;
    @NotBlank
    private String cidade;

    public Endereco(UUID idPessoa, EnderecoRequest enderecoRequest) {
        this.idPessoaProprietario = idPessoa;
        this.logradouro = enderecoRequest.getLogradouro();
        this.cep = enderecoRequest.getCep();
        this.numero = enderecoRequest.getNumero();
        this.cidade = enderecoRequest.getCidade();
    }
}
