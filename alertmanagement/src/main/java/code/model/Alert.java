package code.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Alert {
	
@Id	
 private int id;
 private String name;
 @ManyToOne
 @JoinColumn(name="flight")
 private Flight flight;
 
public int getId() {
	return id;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
