package com.nitin.docker.dockerspringboot.resource;

import java.util.Scanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

  @GetMapping
  public String hello() {
    return "docker hello";
  }

  public static void main(String []args){
    /*ystem.out.println("Hello World");
    Scanner scanner = new Scanner(System.in);
    String strVal = scanner.nextLine();
    System.out.println("HackerRank::" + strVal);
    scanner.close();*/
    solve(12.00,20,8);
    solve(15.50,15,10);

  }
  static void solve(double meal_cost, int tip_percent, int tax_percent) {
    double tip = (meal_cost * tip_percent)/100;
    System.out.println(tip);
    double tax = (meal_cost * tax_percent)/100;
    System.out.println(tax);
    double total = meal_cost + tip + tax;
    int roundoff = (int) Math.round(total);
    System.out.println(roundoff);
  }

}
