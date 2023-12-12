package br.com.diego.service;

import br.com.diego.dto.CepResponse;
import br.com.diego.handlerexception.CepNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class CepService {

    private final ViaCepFeignClient viaCepFeignClient;

    public CepService(final ViaCepFeignClient viaCepFeignClient) {
        this.viaCepFeignClient = viaCepFeignClient;
    }

    public Mono<CepResponse> getCepInfo(String cep) {

        if (!isValidCep(cep)) {
            log.error("CEP inválido: {}", cep);
            return Mono.error(new CepNotFoundException("CEP inválido: " + cep));
        }
        log.info("Buscando informações do CEP: {}", cep);
        return viaCepFeignClient.getCepInfo(cep)
                .doOnError(throwable -> {
                    log.error("Erro ao buscar informações do CEP: {}", cep, throwable);
                });
    }

    private boolean isValidCep(String cep) {
        return cep != null && cep.matches("\\d{8}");
    }
}



