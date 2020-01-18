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
import org.springframework.web.bind.annotation.RestController;
import com.example.market.data.Item;
import com.example.market.data.ItemRepository;

@RestController
public class ItemController {
	
	@Autowired
	ItemRepository itemrepo;
	
	
	@GetMapping("/items")
	public List<Item> getitems() {
	
		return itemrepo.findAll();
			
	}
	
	@GetMapping("/items/{id}")
	public Optional<Item> getitem(@PathVariable("id")int id) {
	
		return itemrepo.findById(id);
			
	}
	
	@PostMapping("/items") 
	public String additem(@RequestBody Item item) {
		itemrepo.save(item);
		return "added successfully";
	}
	
	@DeleteMapping("/items/{id}")
	public String deleteitem(@PathVariable("id")int id) {
		itemrepo.deleteById(id);
		return "deleted successfully";
	}
	
	@PutMapping("/items")
	public String updateitem(@RequestBody Item item) {
		itemrepo.save(item);
		return "updated successfully";
	}
	
}
