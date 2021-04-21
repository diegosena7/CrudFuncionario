package br.com.funcionario.crudfuncionario.model.dto;

import br.com.funcionario.crudfuncionario.model.entities.TbCargo;
import br.com.funcionario.crudfuncionario.model.entities.TbFuncionario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbFuncionarioDTO implements Serializable {

    private Integer funcionario_id;
    private String funcionario_nome;
    private Integer funcionario_age;
    private Date funcionario_birthday;
    private String funcionario_document;
    private TbCargo dadosCargo;

   public TbFuncionarioDTO (TbFuncionario funcionario){
       this.funcionario_id = funcionario.getFuncionario_id();
       this.funcionario_nome = funcionario.getFuncionario_nome();
       this.funcionario_age = funcionario.getFuncionario_age();
       this.funcionario_birthday = funcionario.getFuncionario_birthday();
       this.funcionario_document = funcionario.getFuncionario_document();
       this.dadosCargo = funcionario.getCargo_id();
   }
}
