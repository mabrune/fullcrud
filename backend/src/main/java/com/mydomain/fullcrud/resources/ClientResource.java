package com.mydomain.fullcrud.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydomain.fullcrud.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Ashley Ballard", "34567892101", 1000.0, Instant.parse("1960-01-29T00:00:00Z"), 3));
		list.add(new Client(2L, "Adam Barker", "34567892102", 1100.0, Instant.parse("1961-02-28T00:00:00Z"), 2));
		list.add(new Client(3L, "Emma Atkinson", "34567892103", 1200.0, Instant.parse("1962-03-27T00:00:00Z"), 1));
		return ResponseEntity.ok().body(list);				
	}
}
