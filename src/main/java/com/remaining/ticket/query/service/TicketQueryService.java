package com.remaining.ticket.query.service;

import com.remaining.ticket.query.dao.entity.Ticket;
import com.remaining.ticket.query.dao.repository.TicketRepository;
import com.remaining.ticket.query.dto.TicketDto;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketQueryService {

    private final TicketRepository ticketRepository;

    public TicketQueryService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Cacheable("tickets")
    public List<TicketDto> getAllTickets() {
        List<Ticket> tickets = ticketRepository.findAll();
        return mapToTicketsResultDto(tickets);
    }

    @CacheEvict(value = "tickets", allEntries = true)
    public void clearCache() {
    }

    private List<TicketDto> mapToTicketsResultDto(List<Ticket> tickets) {
        List<TicketDto> ticketDtos = new ArrayList<>();
        for(Ticket ticket : tickets) {
            TicketDto ticketDto = mapToTicketResultDto(ticket);
            ticketDtos.add(ticketDto);
        }
        return ticketDtos;
    }

    private TicketDto mapToTicketResultDto(Ticket ticket) {
        return TicketDto.builder()
                .ticketId(ticket.getId())
                .price(ticket.getPrice())
                .availability(ticket.getAvailability())
                .concertId(ticket.getId())
                .build();
    }
}
