package br.com.funcionario.crudfuncionario.repositories;

import br.com.funcionario.crudfuncionario.model.entities.TbFuncionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbFuncionarioRepository extends JpaRepository<TbFuncionario, Integer> {
}
