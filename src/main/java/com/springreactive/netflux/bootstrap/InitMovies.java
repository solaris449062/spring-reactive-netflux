package com.springreactive.netflux.bootstrap;

import com.springreactive.netflux.domain.Movie;
import com.springreactive.netflux.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@Component
public class InitMovies implements CommandLineRunner {
    private final MovieRepository movieRepository;

    @Override
    public void run (String... args) throws Exception {
        movieRepository.deleteAll()
                .thenMany(
                    Flux.just("Avatar", "Megan", "Avengers", "Quantumania", "Knock at the cabin", "Squid game")
                    .map(title -> Movie.builder().title(title).build())
                    .flatMap(movieRepository::save)
                ).subscribe(null, null, () -> {
                    movieRepository.findAll().subscribe(System.out::println);
                });

    }
}
