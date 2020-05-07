package com.ticketbooking.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ticketbooking.example.domain.Ticket;
import com.ticketbooking.example.service.TicketService;

@RestController
@RequestMapping(value="/api/tickets")
//http://localhost:8080/api/tickets-> TicketController will be called.

//Normal Test Code
public class TicketController {

		@Autowired
		private TicketService ticketService;
	

	//Create Ticket
	@PostMapping(value="/create")
	//http://localhost:8080/api/tickets/create
	
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketService.createTicket(ticket);
	}
	
	
	//Get All Tickets
	
	@GetMapping(value="/allTickets")
	//http://localhost:8080/api/tickets/allTickets
	public Iterable<Ticket> getAllTickets()
	{
		return ticketService.getAllTickets();
	}
	
	
	//Get a Ticket
	//http://localhost:8080/api/tickets/1-> 1st Ticket
	//http://localhost:8080/api/tickets/2-> 2nd  Ticket
	@GetMapping(value="/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId")
								Integer ticketId) {
		return ticketService.getTicket(ticketId);
	}
	
	
	
	
	//Update a Ticket
	//http://localhost:8080/api/tickets/1/a@b.com
	@PutMapping(value="{ticketId}/{newEmail}")
	public Ticket updateTicket(
			@PathVariable("ticketId") Integer ticketId,
			@PathVariable("newEmail") String newEmail) {
		return ticketService.updateTicket(ticketId, newEmail);
	}
	
	
	
	
	
	//Delete Ticket
	//http://localhost:8080/api/tickets/delete/1 -> 1st Deleted
	@DeleteMapping(value="/delete/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		ticketService.deleteTicket(ticketId);
	}

}
