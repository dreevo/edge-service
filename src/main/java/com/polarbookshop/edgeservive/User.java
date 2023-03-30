package com.polarbookshop.edgeservive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String username;
    String firstName;
    String lastName;
    List<String> roles;

}
