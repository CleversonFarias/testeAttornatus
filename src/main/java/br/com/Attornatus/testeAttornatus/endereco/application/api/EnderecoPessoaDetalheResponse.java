package br.com.Attornatus.testeAttornatus.endereco.application.api;

import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;
import jakarta.validation.constraints.NotBlank;
import lombok.Value;

import java.util.UUID;
@Value
public class EnderecoPessoaDetalheResponse {
    private UUID idEndereco;
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;


    public EnderecoPessoaDetalheResponse(Endereco endereco) {
        this.idEndereco = endereco.getIdEndereco();
        this.logradouro = endereco.getLogradouro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
    }
}
