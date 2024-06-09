package com.osypenko.suppliermonitoringtelegrambot.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Users worker;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Users manager;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Project project;
    @Column(name = "text")
    private String text;
    @Column(name = "extra_info")
    private String extraInfo;
    @Enumerated(EnumType.STRING)
    @Column(name = "task_status")
    private TaskStatus taskStatus;
}
