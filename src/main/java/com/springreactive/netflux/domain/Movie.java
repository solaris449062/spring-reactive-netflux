package com.springreactive.netflux.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
    private String id;

    @NonNull
    private String title;
}
