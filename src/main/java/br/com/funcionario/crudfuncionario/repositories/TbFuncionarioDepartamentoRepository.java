package br.com.funcionario.crudfuncionario.repositories;

import br.com.funcionario.crudfuncionario.model.entities.TbFuncionarioDepartamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbFuncionarioDepartamentoRepository extends JpaRepository<TbFuncionarioDepartamento, Integer> {
}
