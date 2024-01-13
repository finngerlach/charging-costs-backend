package de.finngerlach.chargingcosts.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class ChargingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    UUID id;
    ZonedDateTime startTime;
    ZonedDateTime endTime;
    BigDecimal energyAdded;
    String comment;

    public ChargingSession(ZonedDateTime startTime, ZonedDateTime endTime, BigDecimal energyAdded, String comment) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.energyAdded = energyAdded;
        this.comment = comment;
    }
}
