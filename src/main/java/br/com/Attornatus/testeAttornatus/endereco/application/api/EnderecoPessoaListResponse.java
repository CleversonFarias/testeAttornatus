package br.com.Attornatus.testeAttornatus.endereco.application.api;

import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;
import lombok.Value;

import java.util.List;
import java.util.stream.Collectors;

@Value
public class EnderecoPessoaListResponse {
    private String logradouro;
    private String cep;
    private String numero;
    private String cidade;

    public static List<EnderecoPessoaListResponse> converte(List<Endereco> enderecoDaPessoa) {
        return enderecoDaPessoa.stream()
                .map(EnderecoPessoaListResponse::new)
                .collect(Collectors.toList());
    }

    public EnderecoPessoaListResponse(Endereco endereco) {
        this.logradouro = endereco.getLogradouro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.cidade = endereco.getCidade();
    }
}
