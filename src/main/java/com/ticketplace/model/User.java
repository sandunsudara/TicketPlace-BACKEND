package com.ticketplace.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private LoginDetail loginDetail;
}
