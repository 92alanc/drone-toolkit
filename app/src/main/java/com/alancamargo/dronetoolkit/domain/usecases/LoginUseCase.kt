package com.alancamargo.dronetoolkit.domain.usecases

interface LoginUseCase {
    operator fun invoke(email: String, password: String)
}