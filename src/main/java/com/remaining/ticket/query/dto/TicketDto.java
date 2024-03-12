package com.remaining.ticket.query.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {
    private Integer ticketId;
    private BigDecimal price;
    private Integer concertId;
    private Integer availability;
}
