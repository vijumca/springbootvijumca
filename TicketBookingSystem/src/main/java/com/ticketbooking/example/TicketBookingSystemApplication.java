package com.ticketbooking.example;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ticketbooking.example.domain.Ticket;
import com.ticketbooking.example.service.TicketService;

@SpringBootApplication
public class TicketBookingSystemApplication implements CommandLineRunner {

	@Autowired
	private TicketService ticketService;
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingSystemApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		SaveTicket();
		
	}
	
	private void SaveTicket()
	{
		Ticket ticket=new Ticket();
		
		ticket.setPassengerName("RAMU");
		ticket.setEmail("ramu@gmail.com");
		ticket.setSourceStation("HYDERABAD");
		ticket.setDestinationStation("GOA");
		ticket.setTravelDate(new Date());
		ticketService.createTicket(ticket);
	}


	
	

}
