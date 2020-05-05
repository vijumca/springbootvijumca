package com.ticketbooking.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Table Creation
@Table(name="ticket") //Table Name=ticket
public class Ticket {
	
	@Id //Primary Key
	@GeneratedValue(strategy = GenerationType.AUTO)
	//Primary Key Generation
	//AUTO -> Hibernate will take are of PK population
	@Column(name="ticket_id") //Column Name=ticket_id
	private Integer ticketId;
	
	@Column(name="passenger_name",nullable = false)
	private String passengerName;
	
	@Column(name="source_station")
	private String sourceStation;
	
	
	@Column(name="destination_station")
	private String destinationStation;
	
	@Column(name="travel_date")
	private Date travelDate;
	
	@Column(name="email",unique = true)
	private String email;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ticket() {} // Default Constructor
	
	//ui Willl give JSON Format, JSON TO JAVA AND JAVA TO JSON -> Frame work will 
	//take of conversion. As per framework we need to write default constructor
	
	
	public Ticket(String passengerName, String sourceStation, String destinationStation, 
			String email) {
		super();
		this.passengerName = passengerName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.travelDate = new Date();
		this.email = email;
	}
	
	

}
