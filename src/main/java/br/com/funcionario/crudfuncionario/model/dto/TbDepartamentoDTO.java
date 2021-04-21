package br.com.funcionario.crudfuncionario.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbDepartamentoDTO implements Serializable {

    private Integer departamento_id;
    private String departamento_name;
}
