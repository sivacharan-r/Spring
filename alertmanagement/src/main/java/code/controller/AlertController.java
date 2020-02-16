package code.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import code.model.Alert;
import code.repository.AlertRepository;

@RestController
public class AlertController {
	
	@Autowired
	AlertRepository alertrepo;
	
	@GetMapping("/alerts")	
	public List<Alert> getAlerts() {
		return alertrepo.findAll();
	}
	
	@GetMapping("/alerts/{id}")
	public Optional<Alert> getAlert(@PathVariable("id")int id) {
		return alertrepo.findById(id);
	}
	

}
