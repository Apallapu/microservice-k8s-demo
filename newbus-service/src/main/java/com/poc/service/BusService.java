package com.poc.service;

import com.poc.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class BusService {

    @Autowired
    RestTemplate restTemplate;

    @Value("${newbus.url}")
    private String busURL;


    public Ticket createTicket(Ticket ticket) {
        String url = new StringBuilder(busURL).append("/create-bus-ticket").toString();
        return restTemplate.postForObject(url, ticket, Ticket.class);
    }

    public void updateTicket(Ticket ticket, Long id) {
        String url = new StringBuilder(busURL).append("/update-bus-ticket/").append(id).toString();
        restTemplate.put(url, ticket);
    }

    public Ticket getTicketById(Long id) {
        String url = new StringBuilder(busURL).append("/get-bus-ticket/").append(id).toString();
        return restTemplate.getForObject(url, Ticket.class);
    }

    public List<Ticket> getAllTickets() {
        String url = new StringBuilder(busURL).append("/get-All-tickets").toString();
        return restTemplate.getForObject(url, List.class);
    }

    public void deleteTicketById(Long id) {
        String url = new StringBuilder(busURL).append("/delete-bus-ticket/").append(id).toString();
        restTemplate.delete(url);
    }

}


