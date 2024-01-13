package de.finngerlach.chargingcosts.mapper;

import de.finngerlach.chargingcosts.dtos.ChargingSessionRequest;
import de.finngerlach.chargingcosts.dtos.ChargingSessionResponse;
import de.finngerlach.chargingcosts.models.ChargingSession;

public class ChargingSessionMapper {
    public static ChargingSession map(ChargingSessionRequest request) {
        return new ChargingSession(
                request.startTime(),
                request.endTime(),
                request.energyAdded(),
                request.comment()
        );
    }

    public static ChargingSessionResponse map(ChargingSession session) {
        return new ChargingSessionResponse(
                session.getId(),
                session.getStartTime(),
                session.getEndTime(),
                session.getEnergyAdded(),
                session.getComment()
        );
    }
}
