package com.alancamargo.dronetoolkit.domain.model

data class Drone(
    val id: String,
    val name: String,
    val maximumTakeoffWeight: Double,
    val status: DroneStatus
)
