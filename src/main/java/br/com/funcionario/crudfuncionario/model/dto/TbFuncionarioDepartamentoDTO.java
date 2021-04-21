package br.com.funcionario.crudfuncionario.model.dto;

import br.com.funcionario.crudfuncionario.model.entities.TbDepartamento;
import br.com.funcionario.crudfuncionario.model.entities.TbFuncionario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbFuncionarioDepartamentoDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private TbFuncionario funcionario_id;
    private TbDepartamento departamento_id;
}
