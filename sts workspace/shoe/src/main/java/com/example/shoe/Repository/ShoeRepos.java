package com.example.shoe.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shoe.Model.ShoeModel;

public interface ShoeRepos extends JpaRepository<ShoeModel, Integer> {

}
