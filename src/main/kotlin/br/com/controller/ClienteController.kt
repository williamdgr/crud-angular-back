package br.com.controller

import br.com.model.Cliente
import br.com.repository.ClienteRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/")
@CrossOrigin(origins = ["*"])
class TopicoController(private val repository: ClienteRepository) {

    @PostMapping
    fun cadastrar(
        @RequestBody cliente: Cliente,
    ): ResponseEntity<Cliente> {
        return ResponseEntity.ok(repository.save(cliente))
    }

    @GetMapping
    fun selecionar(): List<Cliente> {
        return repository.findAll()
    }

    @PutMapping
    fun editar(
        @RequestBody cliente: Cliente,
    ): ResponseEntity<Cliente> {
        return ResponseEntity.ok(repository.save(cliente))
    }

    @DeleteMapping("/{codigo}")
    fun remover(
       @PathVariable codigo: Long,
    ) {
       repository.deleteById(codigo)
    }
}