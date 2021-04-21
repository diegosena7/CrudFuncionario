package br.com.funcionario.crudfuncionario.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Classe responsável pelos atributos do BD, nela estamos trabalhando com as anotações
 * @Entity, @Data,  @AllArgsConstructor, @NoArgsConstructor para gerar automaticamente
 * os Getters e Setters e os construtores padrão e com argumentos.
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="TbFuncionario")
public class TbFuncionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "funcionario_id")
    private Integer funcionario_id;

    @Column(name="funcionario_nome")
    private String funcionario_nome;

    @Column(name="funcionario_age")
    private Integer funcionario_age;

    @Column(name="funcionario_birthday")
    private Date funcionario_birthday;

    @Column(name="funcionario_document")
    private String funcionario_document;

    @ManyToOne
    @JoinColumn(name= "cargo_id")
    private TbCargo cargo_id;
}
