package br.com.Attornatus.testeAttornatus.pessoa.infra;

import br.com.Attornatus.testeAttornatus.pessoa.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaSpringDataJPARepository extends JpaRepository<Pessoa, UUID>  {

}
