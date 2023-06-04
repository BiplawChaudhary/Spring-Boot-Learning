package com.security.securityJwtPractice.service;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

public interface JwtService {

//    Extracts the username from the token
     String extractUsername(String token);

//     Extracting the claims
     <T> T extractClaims(String token, Function<Claims, T> claimsResolver);

     Claims extractAllClaims(String token);

     //Getting the signing key
     Key getSigningKey();

     //Generating the token for new user
     String generateToken( Map<String, Object> extraClaims,
                           UserDetails userDetails);


     String generateToken(UserDetails userDetails);

//     Checking if the token is valid or not

     boolean isTokenValid(String token, UserDetails userDetails);

     boolean isTokenExpired(String Token);

     Date extractExpiration(String token);


}
