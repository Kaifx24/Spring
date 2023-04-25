package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.ShoeModel;

public interface ShoeRepos extends JpaRepository<ShoeModel, Integer> {

}
