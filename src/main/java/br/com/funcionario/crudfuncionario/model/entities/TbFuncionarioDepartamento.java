package br.com.funcionario.crudfuncionario.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TbFuncionarioDepartamento")
public class TbFuncionarioDepartamento {

    @Id
    private Integer idFuncionarioDepto;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private TbFuncionario funcionario_id;

    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private TbDepartamento departamento_id;
}
