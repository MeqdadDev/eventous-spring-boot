package com.meqdaddev.eventapi.services;

import com.meqdaddev.eventapi.dto.EventDto;

import java.util.List;

public interface EventService {
    void createEvent(Long clubId, EventDto eventDto);

    List<EventDto> findAllEvents();

    EventDto findByEventId(Long eventId);

    void updateEvent(EventDto eventDto);

    void deleteEvent(Long eventId);
}
