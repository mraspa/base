package com.prueba.msprueba.service;

import com.prueba.msprueba.entity.UserLogin;
import com.prueba.msprueba.repository.IUserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private IUserLoginRepository userLoginRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtService jwtService;

    public String saveUser(UserLogin userLogin) {
        userLogin.setPassword(passwordEncoder.encode(userLogin.getPassword()));
        userLoginRepository.save(userLogin);
        return "user added to the system";
    }

    public String generateToken(String username) {
        return jwtService.generateToken(username);
    }

    public void validateToken(String token) {
        jwtService.validateToken(token);
    }
}
