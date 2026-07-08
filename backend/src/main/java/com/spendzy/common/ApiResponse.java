package com.spendzy.common;
public record ApiResponse<T>(boolean success,String message,T data){}