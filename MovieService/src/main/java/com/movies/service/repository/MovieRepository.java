/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.service.repository;

import com.movies.service.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author FIQMANAN
 */
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    
}
