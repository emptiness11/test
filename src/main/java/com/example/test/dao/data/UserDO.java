package com.example.test.dao.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "user")
public class UserDO {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
    private Long businessId;
    private String username;
    private String mobile;
    private String password;
}
