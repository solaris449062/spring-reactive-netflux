package com.springreactive.netflux.repository;

import com.springreactive.netflux.domain.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {

}
