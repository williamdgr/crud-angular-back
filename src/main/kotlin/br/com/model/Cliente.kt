package br.com.model

import javax.persistence.*

@Entity
@Table(name = "clientes")
class Cliente (
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val codigo: Long? = null,
    val nome: String,
    val idade: Int,
    val cidade: String
)