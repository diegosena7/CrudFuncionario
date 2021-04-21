package br.com.funcionario.crudfuncionario.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Classe responsável pelos atributos do BD, nela estamos trabalhando com as anotações
 * @Entity, @Data,  @AllArgsConstructor, @NoArgsConstructor para gerar automaticamente
 * os Getters e Setters e os construtores padrão e com argumentos.
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TbCargo")
public class TbCargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "cargo_id")
    private Integer cargo_id;

    @Column(name= "cargo_name")
    private String cargo_name;
}
