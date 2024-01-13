package de.finngerlach.chargingcosts.dtos;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

public record ChargingSessionResponse(
        UUID id,
        ZonedDateTime startTime,
        ZonedDateTime endTime,
        BigDecimal energyAdded,
        String comment
) { }
