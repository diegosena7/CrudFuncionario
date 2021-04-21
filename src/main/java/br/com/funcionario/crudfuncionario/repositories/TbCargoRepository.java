package br.com.funcionario.crudfuncionario.repositories;

import br.com.funcionario.crudfuncionario.model.entities.TbCargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbCargoRepository extends JpaRepository<TbCargo, Integer> {
}
