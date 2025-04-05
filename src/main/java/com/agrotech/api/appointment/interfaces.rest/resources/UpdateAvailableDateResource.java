package com.agrotech.api.appointment.interfaces.rest.resources;

import java.time.LocalDate;

public record UpdateAvailableDateResource(LocalDate availableDate,
                                          String startTime,
                                          String endTime) {
}
