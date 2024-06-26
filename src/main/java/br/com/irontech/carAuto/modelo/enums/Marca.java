package br.com.irontech.carAuto.modelo.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString

public enum Marca {
    CHEVROLET("Chevrolet"),
    VOLKSWAGEN("Volkswagen"),
    FIAT("Fiat"),
    TOYOTA("Toyota"),
    HYUNDAI("Hyundai"),
    FORD("Ford"),
    HONDA("Honda"),
    NISSAN("Nissan"),
    RENAULT("Renault"),
    JEEP("Jeep"),
    MITSUBISHI("Mitsubishi"),
    PEUGEOT("Peugeot"),
    CITROEN("Citroen"),
    KIA("Kia"),
    BMW("BMW"),
    MERCEDES_BENZ("Mercedes-Benz"),
    AUDI("Audi"),
    VOLVO("Volvo"),
    LAND_ROVER("Land Rover"),
    SUZUKI("Suzuki"),
    CHERY("Chery"),
    JAC("JAC"),
    TESLA("Tesla");

    private String descricao;
}
