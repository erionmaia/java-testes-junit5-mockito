package br.com.erionmaia.api.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class StandardError {

    private LocalDateTime timestamp;
    private Integer Status;
    private String error;
    private String path;
}
