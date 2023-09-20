package br.com.Attornatus.testeAttornatus.pessoa.infra;

import br.com.Attornatus.testeAttornatus.pessoa.application.repository.PessoaRepository;
import br.com.Attornatus.testeAttornatus.pessoa.domain.Pessoa;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
@Log4j2
@Repository
public class PessoaInfraRepository implements PessoaRepository {
    @Override
    public Pessoa salva(Pessoa pessoa) {
        log.info("[inicia] PessoaInfraRepository - salva");
        //                    pessoaInfra.salva(Pessoa pessoa);
        log.info("[finaliza] PessoaInfraRepository - salva");
        return pessoa;
    }
}
