package br.com.diego.service;

import br.com.diego.dto.CepResponse;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@ReactiveFeignClient(name = "viacep", url = "https://viacep.com.br")
public interface ViaCepFeignClient {

    @GetMapping("/ws/{cep}/json/")
    Mono<CepResponse> getCepInfo(@PathVariable("cep") String cep);
}
