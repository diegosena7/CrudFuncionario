package br.com.funcionario.crudfuncionario.service;

import br.com.funcionario.crudfuncionario.model.dto.TbCargoDTO;
import br.com.funcionario.crudfuncionario.model.dto.TbFuncionarioDTO;
import br.com.funcionario.crudfuncionario.model.entities.TbCargo;
import br.com.funcionario.crudfuncionario.repositories.TbCargoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class TbCargoService {

    final private TbCargoRepository cargoRepository;

    /**
     * Método responsável por retornar todoso os cargos
     * @return
     */
    public List<TbCargoDTO> buscarCargos(){
        List<TbCargo> cargo = cargoRepository.findAll();
        return cargo.stream().map(cargos -> new TbCargoDTO(cargos)).collect(Collectors.toList());
    }

    /**
     * Método responsável por criar um objeto do tipo Cargo
     * @param cargo
     * @return
     */
    public TbCargo criarCargo(TbCargo cargo){
        return cargoRepository.save(cargo);
    }

    /**
     * Método responsável por deletar um cargo
     * @param idCargo
     */
    public void deletarCargo(Integer idCargo){
        cargoRepository.deleteById(idCargo);
    }

    /**
     * Método responsável por atualizar um cargo
     * @param cargo
     * @return
     */
    public TbCargo atualizarCargo(TbCargo cargo){
        return cargoRepository.save(cargo);
    }
}
