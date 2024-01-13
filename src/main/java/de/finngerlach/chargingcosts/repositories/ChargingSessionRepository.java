package de.finngerlach.chargingcosts.repositories;

import de.finngerlach.chargingcosts.models.ChargingSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChargingSessionRepository extends JpaRepository<ChargingSession, UUID> {
}
