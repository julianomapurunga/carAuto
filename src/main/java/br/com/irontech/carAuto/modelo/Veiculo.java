package br.com.irontech.carAuto.modelo;

import br.com.irontech.carAuto.modelo.enums.Marca;
import br.com.irontech.carAuto.modelo.enums.TipoVeiculo;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Veiculo extends EntidadeGenerica{

    private Modelo modelo;
    private Marca marca;
    private TipoVeiculo TipoVeiculo;
    private String cor;
    private String placa;
    private Pessoa proprietarioAtual;
    private Pessoa proprietarioAnterior;
    private int anoFabricacao;
    private int anoModelo;
}
