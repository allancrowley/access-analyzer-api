package com.access.dto;

//DTO for transfering data about authentication failures (transfers for analyzing for attack possibility)
public record AuthFailureDto(String ip, Long timestamp, String webserviceName) {
}
