package com.SreamAPI.Three;
import java.util.*;
import java.util.stream.*;
public class Main {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
                new Claim("Health", 69000),
                new Claim("Vehicle", 698000),
                new Claim("Health", 67000),
                new Claim("Property", 612000),
                new Claim("Vehicle", 69000),
                new Claim("Health", 69000)
        );
        Map<String, Double> avgClaimByType = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));
        avgClaimByType.forEach((type, avg) ->
                System.out.println(type + " → Average Claim: " + avg)
        );
    }
}
