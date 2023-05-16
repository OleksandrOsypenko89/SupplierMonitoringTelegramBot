package com.osypenko.suppliermonitoringtelegrambot.entityes;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    @Column(name = "corp_id")
    private Integer corpId;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Project project;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Task> manageTasks = new ArrayList<>();
    @Enumerated(value = EnumType.STRING)
    private Role role = Role.GUEST;
    @Column(name = "access")
    private Long accessTelegramBot;
}
