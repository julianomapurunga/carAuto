package br.com.irontech.carAuto.modelo;

import br.com.irontech.carAuto.modelo.enums.Marca;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Modelo {
    
    private Marca marca;
    private String nome;

}
