package com.cinema.Cine.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.Cine.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{
}
