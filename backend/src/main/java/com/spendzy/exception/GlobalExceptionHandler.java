package com.spendzy.exception;
import org.springframework.http.*;import org.springframework.web.bind.annotation.*;import java.time.Instant;
@RestControllerAdvice
public class GlobalExceptionHandler{
@ExceptionHandler(ApiException.class)
public ResponseEntity<ErrorResponse> handle(ApiException ex){
return ResponseEntity.badRequest().body(new ErrorResponse(Instant.now(),400,ex.getMessage()));}}