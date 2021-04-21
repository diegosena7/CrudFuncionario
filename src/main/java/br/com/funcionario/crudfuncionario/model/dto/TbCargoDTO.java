package br.com.funcionario.crudfuncionario.model.dto;

import br.com.funcionario.crudfuncionario.model.entities.TbCargo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbCargoDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer cargo_id;
    private String cargo_name;

    public TbCargoDTO(TbCargo cargos) {
        this.cargo_id = cargos.getCargo_id();
        this.cargo_name = cargos.getCargo_name();
    }
}
