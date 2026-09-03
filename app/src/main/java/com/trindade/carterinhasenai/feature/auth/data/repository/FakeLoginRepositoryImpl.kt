package com.trindade.carterinhasenai.feature.auth.data.repository

import com.trindade.carterinhasenai.feature.auth.domain.model.UsuarioLogado
import kotlinx.coroutines.delay

class FakeLoginRepositoryImpl : LoginRepository {

    override suspend fun login(usuario: String, senha: String): Result<UsuarioLogado> {
        delay(1500)

        return if (usuario == "aluno" && senha == "123") {
            Result.success(
                UsuarioLogado(
                    id = "12 - 3",
                    nome = "Pedro",
                    curso = "Desenvolvimento de Sistemas",
                    turma = "2DEVEST-A",
                    token = "token-fake-vindo-do-sistema"
                )
            )
        } else {
            Result.failure(IllegalArgumentException("Usuário ou senha inválidos"))
        }
    }
}
