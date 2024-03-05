package com.egesua.connectHub.security;

import com.egesua.connectHub.services.UserDetailsServiceImpl;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class JwtAuthenticationFilter extends OncePerRequestFilter {
    @Autowired
    JwtTokenProvider jwtTokenProvider;
    @Autowired
    UserDetailsServiceImpl userDetailsService;
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String JwtToken = extractJwtFromRequest(request);
                if(StringUtils.hasText(jwtToken) && jwtTokenProvider.validateToken(jwtToken)){
                    Long id = jwtTokenProvider.getUserIdFromJwt(jwtToken);
                    UserDetails user = userDetailsService.loadUserById(id);
                    if(user != null) {
                        User
                    }
                }


            }
        }
    }

    private String extractJwtFromRequest(HttpServletRequest request) {
        String bearer = request.getHeader("Authorization");
        if(StringUtils.hasText(bearer) && bearer.startsWith("Bearer "))
            return bearer.substring("Bearer".length() + 1);
        return null
}
