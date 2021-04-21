package br.com.funcionario.crudfuncionario.repositories;

import br.com.funcionario.crudfuncionario.model.entities.TbDepartamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbDepartamentoRepository extends JpaRepository<TbDepartamento, Integer> {
}
