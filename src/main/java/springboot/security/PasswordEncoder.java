package springboot.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

    public static  void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPassword="123123";
        String encodePassword = encoder.encode(rawPassword);
        System.out.println(encodePassword);
    }
}
