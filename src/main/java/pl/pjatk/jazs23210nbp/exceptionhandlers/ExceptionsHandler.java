package pl.pjatk.jazs23210nbp.exceptionhandlers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

@RestControllerAdvice
public class ExceptionsHandler {

    @ExceptionHandler(HttpClientErrorException.NotFound.class)
    public ResponseEntity<String> notFound(HttpClientErrorException.NotFound exception) {
        return ResponseEntity.status(404).body("NOT FOUND" + exception.getLocalizedMessage());
    }

    @ExceptionHandler(HttpClientErrorException.BadRequest.class)
    public ResponseEntity<String> badRequest(HttpClientErrorException.BadRequest exception) {
        return ResponseEntity.status(400).body("BAD REQUEST" + exception.getLocalizedMessage());
    }

    @ExceptionHandler(HttpServerErrorException.InternalServerError.class)
    public ResponseEntity<String> badRequestOverLimit(HttpClientErrorException.BadRequest exception) {
        return ResponseEntity.status(400).body("Bad Request - Przekroczony limit" + exception.getLocalizedMessage());
    }
}
