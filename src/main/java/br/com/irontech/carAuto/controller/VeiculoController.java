package br.com.irontech.carAuto.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.irontech.carAuto.modelo.Veiculo;
import br.com.irontech.carAuto.modelo.enums.Marca;
import br.com.irontech.carAuto.modelo.enums.TipoVeiculo;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    
    @GetMapping("/criar")
    public Veiculo criarCarro() {

        Veiculo carro = new Veiculo();
        carro.setMarca(Marca.CHEVROLET);
        //carro.setModelo("Onix");
        carro.setTipoVeiculo(TipoVeiculo.CARRO);
        carro.setCor("Preto");
        carro.setPlaca("ABC-1234");
        carro.setAnoFabricacao(2021);
        carro.setAnoModelo(2021);
        carro.setDataCriacao(LocalDateTime.now());

        return carro;
    }

    @PostMapping("/salvar")
    public void salvarCarro(@RequestBody Veiculo carro){
        System.out.println("Salvando carro " + carro.getMarca() + " " + carro.getModelo());

    }

}
