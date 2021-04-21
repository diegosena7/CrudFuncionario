package br.com.funcionario.crudfuncionario.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TbDepartamento")
public class TbDepartamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="departamento_id")
    private Integer departamento_id;

    @Column(name="departamento_name")
    private String departamento_name;
}
