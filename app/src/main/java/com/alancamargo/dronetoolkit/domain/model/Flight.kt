package com.alancamargo.dronetoolkit.domain.model

import java.util.*

data class Flight(
    val id: String,
    val name: String,
    val drone: Drone,
    val pilot: User,
    val type: FlightType,
    val status: FlightStatus,
    val takeoffLocation: Location,
    val landingLocation: Location,
    val heightInFeet: Int,
    val radiusInMetres: Int,
    val startTime: Date,
    val endTime: Date
)
