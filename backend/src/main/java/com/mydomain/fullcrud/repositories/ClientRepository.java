package com.mydomain.fullcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mydomain.fullcrud.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
