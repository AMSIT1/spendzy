package com.spendzy.user;
import jakarta.persistence.*;
@Entity public class User{
@Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
@Column(unique=true) String email;
String password;
}