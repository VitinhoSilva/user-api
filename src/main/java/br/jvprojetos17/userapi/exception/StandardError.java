package br.jvprojetos17.userapi.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class StandardError {

    private LocalDateTime timesTemp;
    private String error;
    private Integer status;
    private String path;
}
