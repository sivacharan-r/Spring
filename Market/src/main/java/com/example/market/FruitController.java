package com.example.market;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.market.data.Fruit;
import com.example.market.data.FruitRepository;

@RestController
public class FruitController {
	
	@Autowired
	FruitRepository fruitrepo;
	
	@RequestMapping("/")
	public String home() {
		
		return "FruitPage";
	}

	@RequestMapping("/fruit")
	public String saveFruit(Fruit fruit) {
		fruitrepo.save(fruit);
		return "Success";
	}
	
	@GetMapping("/fruits")
	public List<Fruit> getFruits() {
	
		return fruitrepo.findAll();
			
	}
	
	@GetMapping("/fruits/{id}")
	public Optional<Fruit> getFruit(@PathVariable("id")int id) {
	
		return fruitrepo.findById(id);
			
	}
	
	@PostMapping("/fruits") 
	public String addFruit(@RequestBody Fruit fruit) {
		fruitrepo.save(fruit);
		return "added successfully";
	}
	
	@DeleteMapping("/fruits/{id}")
	public String deleteFruit(@PathVariable("id")int id) {
		fruitrepo.deleteById(id);
		return "deleted successfully";
	}
	
	@PutMapping("/fruits")
	public String updateFruit(@RequestBody Fruit fruit) {
		fruitrepo.save(fruit);
		return "updated successfully";
	}
	
}
