package com.sistema.examenes.entidades;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class JwtRequest {

    private String username;
    private String password;


}
