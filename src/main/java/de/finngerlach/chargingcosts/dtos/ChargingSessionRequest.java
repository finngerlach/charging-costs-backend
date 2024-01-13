package de.finngerlach.chargingcosts.dtos;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record ChargingSessionRequest(
        ZonedDateTime startTime,
        ZonedDateTime endTime,
        BigDecimal energyAdded,
        String comment
) { }
