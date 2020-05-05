package com.ticketbooking.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticketbooking.example.dao.TicketDAO;
import com.ticketbooking.example.domain.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketDAO ticketDao;
	
	//TicketDAO ticketDao2 =new TicketDAO();
	
	//Create Ticket
	
	public Ticket createTicket(Ticket ticket) {
		
		return ticketDao.save(ticket);
		
	}
	
	
	//GET ALL Tickets
	
	public Iterable<Ticket> getAllTickets(){
		
		return ticketDao.findAll();
	}
	
	
	//Delete a ticket
	
	public void deleteTicket(Integer ticketId) {
		ticketDao.deleteById(ticketId);
	}
	
	
	//Get a Particular Ticket
	
	public Ticket getTicket(Integer ticketId)
	{
		return ticketDao.findById(ticketId). //Fetech the ticket data
					orElse(new Ticket()); // Dummy Object
	}
	
	//Update Ticket
	
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		
		Ticket ticket=getTicket(ticketId);
		
		ticket.setEmail(newEmail);
		
		return ticketDao.save(ticket);
		
		
		//Save Method will work as follows
		
		 // If PK is there -> It will update
		
		// If PK is not there -> It will create
	}

}
