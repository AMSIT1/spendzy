package com.spendzy.health;
import org.springframework.web.bind.annotation.*;import com.spendzy.common.*;
@RestController @RequestMapping(Constants.API_V1+"/health")
public class HealthController{
@GetMapping public ApiResponse<String> health(){return new ApiResponse<>(true,"OK","Spendzy Backend Running");}}