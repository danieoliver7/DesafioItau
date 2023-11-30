package com.desafioItau.DesafioItau.dto;


import com.desafioItau.DesafioItau.Entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UserDto {


    private Long id;
    private String FirstName;
    private String LastName;
    private int participation;

    private User user;

    public UserDto(User user) {
        id = user.getId();
        FirstName = user.getFirstName();
        LastName = user.getLastName();
        participation = user.getParticipation();
    }
}
