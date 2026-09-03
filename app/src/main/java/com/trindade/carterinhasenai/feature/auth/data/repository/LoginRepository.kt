package com.trindade.carterinhasenai.feature.auth.data.repository

import com.trindade.carterinhasenai.feature.auth.domain.model.UsuarioLogado

interface LoginRepository{
    suspend fun login(usuario: String, senha: String): Result<UsuarioLogado>
}
