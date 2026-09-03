package com.trindade.carterinhasenai.feature.auth.domain.model

data class UsuarioLogado(
    val id: String,
    val nome: String,
    val curso: String,
    val turma: String,
    val token: String
    )
