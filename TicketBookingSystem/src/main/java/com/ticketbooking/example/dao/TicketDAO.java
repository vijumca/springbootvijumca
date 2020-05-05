package com.ticketbooking.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ticketbooking.example.domain.Ticket;

@Repository
public interface TicketDAO extends CrudRepository<Ticket, Integer>{

	
	//CREATE TICKET
	    //save Method  -> insert into ticket()
	
	//GET  A TICKET
	   //findById is the Method => select * from ticket where ticket_id=
	
	//UPDATE A TICKET
	//save Method  -> update ticket
	
	//DELETE A TICKET
	   //deleteById -> delete from ticket where ticket_id
	
	// GET ALL TICKETS
	   //findAll method name -> select * from ticket
}
