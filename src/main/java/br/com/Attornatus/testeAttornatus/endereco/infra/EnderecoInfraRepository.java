package br.com.Attornatus.testeAttornatus.endereco.infra;

import br.com.Attornatus.testeAttornatus.endereco.application.service.EnderecoRepository;
import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
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
    public List<Endereco> buscaEnderecoPessoaComId(UUID idPessoa) {
        log.info("[inicia] EnderecoInfraRepository - buscaEnderecoPessoaComId");
        var enderecos = enderecoSpringDataJPARepository.findByIdPessoaProprietario(idPessoa);
        log.info("[finaliza] EnderecoInfraRepository - buscaEnderecoPessoaComId");
        return enderecos;
    }
}
