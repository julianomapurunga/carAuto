package br.com.irontech.carAuto.modelo.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public enum TipoVeiculo {

    CARRO("Carro"), 
    MOTO("Moto"),
    CAMINHAO("Caminhão");

    private String descricao;

}
