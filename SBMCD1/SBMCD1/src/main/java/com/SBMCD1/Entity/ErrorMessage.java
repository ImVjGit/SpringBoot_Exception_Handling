package com.SBMCD1.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrorMessage {

    private HttpStatus status;//for which status to send
    private String message;

}
