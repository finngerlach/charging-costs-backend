package de.finngerlach.chargingcosts.controllers;

import de.finngerlach.chargingcosts.dtos.ChargingSessionRequest;
import de.finngerlach.chargingcosts.dtos.ChargingSessionResponse;
import de.finngerlach.chargingcosts.mapper.ChargingSessionMapper;
import de.finngerlach.chargingcosts.models.ChargingSession;
import de.finngerlach.chargingcosts.services.ChargingSessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class ChargingSessionController {
    private ChargingSessionService chargingSessionService;

    @PostMapping("/chargingSession")
    public void newChargingSession(@RequestBody ChargingSessionRequest chargingSessionRequest) {
        chargingSessionService.saveChargingSession(ChargingSessionMapper.map(chargingSessionRequest));
    }

    @GetMapping("/chargingSession")
    public List<ChargingSessionResponse> listChargingSessions() {
        List<ChargingSession> chargingSessions = chargingSessionService.listChargingSessions();
        return chargingSessions
                .stream()
                .map(ChargingSessionMapper::map)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/chargingSession/{id}")
    public void deleteChargingSession(@PathVariable UUID id) {
        chargingSessionService.deleteChargingSession(id);
    }
}
