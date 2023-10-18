package br.com.Attornatus.testeAttornatus.endereco.infra;

import br.com.Attornatus.testeAttornatus.endereco.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface EnderecoSpringDataJPARepository extends JpaRepository<Endereco, UUID> {
List<Endereco> findByIdPessoaProprietario(UUID idPessoaProprietario);
}
