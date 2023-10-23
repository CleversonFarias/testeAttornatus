package br.com.Attornatus.testeAttornatus.endereco.infra;

import br.com.Attornatus.testeAttornatus.endereco.application.service.EnderecoRepository;
import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;
import br.com.Attornatus.testeAttornatus.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class EnderecoInfraRepository implements EnderecoRepository {
    private final EnderecoSpringDataJPARepository enderecoSpringDataJPARepository;

    @Override
    public Endereco salvaEndereco(Endereco endereco) {
        log.info("[inicia] EnderecoInfraRepository - salvaEndereco");
        enderecoSpringDataJPARepository.save(endereco);
        log.info("[finaliza] EnderecoInfraRepository - salvaEndereco");
        return endereco ;
    }

    @Override
    public List<Endereco> buscaEnderecosPessoaComId(UUID idPessoa) {
        log.info("[inicia] EnderecoInfraRepository - buscaEnderecosPessoaComId");
        var enderecos = enderecoSpringDataJPARepository.findByIdPessoaProprietario(idPessoa);
        log.info("[finaliza] EnderecoInfraRepository - buscaEnderecosPessoaComId");
        return enderecos;
    }

    @Override
    public Endereco buscaEnderecoPessoaComId(UUID idEndereco) {
        log.info("[inicia] EnderecoInfraRepository - buscaEnderecoPessoaComId");
        var endereco = enderecoSpringDataJPARepository.findById(idEndereco)
                        .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Endereco não encontrado para o idEndereco"));
        log.info("[finaliza] EnderecoInfraRepository - buscaEnderecoPessoaComId");
        return endereco;
    }
}
