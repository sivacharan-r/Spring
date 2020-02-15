package code.model;

import javax.persistence.Entity;

@Entity
public class Alert {
 private int id;
 private String name;
 private String flight;
public int getId() {
	return id;
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
public String getFlight() {
	return flight;
}
public void setFlight(String flight) {
	this.flight = flight;
}
 
}
