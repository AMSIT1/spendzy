package com.spendzy.auth;
import org.springframework.web.bind.annotation.*;import com.spendzy.common.ApiResponse;
@RestController @RequestMapping("/api/v1/auth")
public class AuthController{
@PostMapping("/login") public ApiResponse<String> login(){return new ApiResponse<>(true,"Login endpoint","TODO");}
@PostMapping("/register") public ApiResponse<String> register(){return new ApiResponse<>(true,"Register endpoint","TODO");}
}