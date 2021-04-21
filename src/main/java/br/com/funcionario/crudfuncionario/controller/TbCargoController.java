package br.com.funcionario.crudfuncionario.controller;

import br.com.funcionario.crudfuncionario.model.dto.TbCargoDTO;
import br.com.funcionario.crudfuncionario.model.entities.TbCargo;
import br.com.funcionario.crudfuncionario.repositories.TbCargoRepository;
import br.com.funcionario.crudfuncionario.service.TbCargoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/cargos")
public class TbCargoController {

    final TbCargoService cargoService;
    final TbCargoRepository cargoRepository;

    @GetMapping
    public ResponseEntity<List<TbCargoDTO>> buscarCargos(){
        List<TbCargoDTO> cargoDTO = cargoService.buscarCargos();
        return ResponseEntity.ok().body(cargoDTO);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbCargo criarCargo(@RequestBody TbCargo cargo){
        return cargoService.criarCargo(cargo);
    }

    @DeleteMapping(value = "{idCargo}")
    public ResponseEntity<TbCargo> deletarCargo(@PathVariable("idCargo") Integer idCargo){
        cargoService.deletarCargo(idCargo);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{idCargo}")
    public ResponseEntity atualizarCargo(@PathVariable("idCargo") Integer idCargo, @RequestBody TbCargo cargo){
        return cargoRepository.findById(idCargo).map(
                dados -> {
                    dados.setCargo_name(cargo.getCargo_name());
                    TbCargo tbCargo = cargoRepository.save(dados);
                    return ResponseEntity.ok().body(tbCargo);
                }).orElse(ResponseEntity.notFound().build());
    }
}
