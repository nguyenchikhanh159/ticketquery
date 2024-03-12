package com.remaining.ticket.query.controller;

import com.remaining.ticket.query.dto.TicketDto;
import com.remaining.ticket.query.service.TicketQueryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TicketQueryController {

    private final TicketQueryService ticketQueryService;

    public TicketQueryController(TicketQueryService ticketQueryService) {
        this.ticketQueryService = ticketQueryService;
    }

    @GetMapping(path = "/tickets/v1", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TicketDto>> getAllTickets() {
        List<TicketDto> ticketResult = ticketQueryService.getAllTickets();
        return new ResponseEntity<>(ticketResult, HttpStatus.OK);
    }
}
