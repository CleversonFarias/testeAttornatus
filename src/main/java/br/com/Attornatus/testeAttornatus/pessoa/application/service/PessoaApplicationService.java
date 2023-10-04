package br.com.Attornatus.testeAttornatus.pessoa.application.service;

import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaDetalhadaResponse;
import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaListResponse;
import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaRequest;
import br.com.Attornatus.testeAttornatus.pessoa.application.api.PessoaResponse;
import br.com.Attornatus.testeAttornatus.pessoa.application.repository.PessoaRepository;
import br.com.Attornatus.testeAttornatus.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService {
    private final PessoaRepository pessoaRepository;

    @Override
    public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
        log.info("[inicia] PessoaApplicationService - criaPessoa");
        Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
        log.info("[finaliza] PessoaApplicationService - criaPessoa");
        return PessoaResponse.builder()
                .idPessoa(pessoa.getIdPessoa())
                .build();
    }

    @Override
    public List<PessoaListResponse> listaTodasPessoas() {
        log.info("[inicia] PessoaApplicationService - listaTodasPessoas");
        List<Pessoa> pessoas = pessoaRepository.listaTodasPessoas();
        log.info("[finaliza] PessoaApplicationService - listaTodasPessoas");
        return PessoaListResponse.convert(pessoas);
    }

    @Override
    public PessoaDetalhadaResponse buscaPessoaPeloId(UUID idPessoa) {
        log.info("[inicia] PessoaApplicationService - buscaPessoaPeloId");
        Pessoa pessoa = pessoaRepository.buscaPessoaAtravesId(idPessoa);
        log.info("[finaliza] PessoaApplicationService - buscaPessoaPeloId");
        return new PessoaDetalhadaResponse(pessoa);
    }
}
