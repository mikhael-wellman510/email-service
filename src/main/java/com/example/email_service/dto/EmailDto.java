package com.example.email_service.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class EmailDto {

    private String to;
    private String subject;
    private String body;

    @Override
    public String toString() {
        return "EmailDto{" +
                "to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
