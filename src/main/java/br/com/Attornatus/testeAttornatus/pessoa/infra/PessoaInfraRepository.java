package br.com.Attornatus.testeAttornatus.pessoa.infra;

import br.com.Attornatus.testeAttornatus.pessoa.application.repository.PessoaRepository;
import br.com.Attornatus.testeAttornatus.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Log4j2
@Repository
public class PessoaInfraRepository implements PessoaRepository {
    private final PessoaSpringDataJPARepository pessoaSpringDataJPARepository;

    @Override
    public Pessoa salva(Pessoa pessoa) {
        log.info("[inicia] PessoaInfraRepository - salva");
        pessoaSpringDataJPARepository.save(pessoa);
        log.info("[finaliza] PessoaInfraRepository - salva");
        return pessoa;
    }

    @Override
    public List<Pessoa> listaTodasPessoas() {
        log.info("[inicia] PessoaInfraRepository - listaTodasPessoas");
        List<Pessoa> todasPessoas = pessoaSpringDataJPARepository.findAll();
        log.info("[finaliza] PessoaInfraRepository - listaTodasPessoas");
        return todasPessoas;
    }
}
