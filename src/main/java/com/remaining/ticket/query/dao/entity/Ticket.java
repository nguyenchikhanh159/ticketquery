package com.remaining.ticket.query.dao.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="concert_id")
    private Integer concertId;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "availability")
    private Integer availability;
}
