package code.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Flight {
    @Id  
	private String flight;
	private String source;
	private String destination;	
	@OneToMany(mappedBy="flight")
	private List<Alert> alerts;
	
	public List<Alert> getAlerts() {
		return alerts;
	}
	public void setAlert(List<Alert> alerts) {
		this.alerts = alerts;
	}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}	
}
