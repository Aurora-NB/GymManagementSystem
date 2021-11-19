package com.hrbust.gymmanagementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hrbust.mapper")
public class GymManagementSystemApplication {

  public static void main(String[] args) {
    SpringApplication.run(GymManagementSystemApplication.class, args);
  }
}
