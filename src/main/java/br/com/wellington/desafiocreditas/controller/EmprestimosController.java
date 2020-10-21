package br.com.wellington.desafiocreditas.controller;

import br.com.wellington.desafiocreditas.model.Emprestimo;
import br.com.wellington.desafiocreditas.model.EmprestimoEntradaDTO;
import br.com.wellington.desafiocreditas.model.EmprestimoSaidaDTO;
import br.com.wellington.desafiocreditas.service.EmprestimoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping(value = "api")
public class EmprestimosController {

    private EmprestimoService emprestimoService;

    public EmprestimosController(EmprestimoService emprestimoService) {
        this.emprestimoService = emprestimoService;
    }

    @PostMapping(value = "emprestimos")
    public ResponseEntity<EmprestimoSaidaDTO> post(@RequestBody EmprestimoEntradaDTO emprestimoEntradaDTO) {
        Set<Emprestimo> emprestimosElegiveis = this.emprestimoService.obterEmprestimosElegiveis(emprestimoEntradaDTO);
        return ResponseEntity.status(OK).body(new EmprestimoSaidaDTO(emprestimoEntradaDTO.getCliente().getNome(), emprestimosElegiveis));
    }

}
