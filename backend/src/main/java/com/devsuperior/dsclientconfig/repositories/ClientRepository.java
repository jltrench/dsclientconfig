package com.devsuperior.dsclientconfig.repositories;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsclientconfig.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
