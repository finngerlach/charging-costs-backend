package de.finngerlach.chargingcosts.services;

import de.finngerlach.chargingcosts.models.ChargingSession;
import de.finngerlach.chargingcosts.repositories.ChargingSessionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ChargingSessionService {

    private ChargingSessionRepository chargingSessionRepository;

    public void saveChargingSession(ChargingSession session) {
        chargingSessionRepository.save(session);
    }

    public List<ChargingSession> listChargingSessions() {
        return chargingSessionRepository.findAll();
    }

    public void deleteChargingSession(UUID id) {
        chargingSessionRepository.deleteById(id);
    }
}
