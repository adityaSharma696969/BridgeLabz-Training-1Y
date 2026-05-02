package com.LambdaExpressions.Three;
import java.util.*;
import java.util.logging.StreamHandler;
import java.util.stream.*;
public class InvoiceGenerator{
    static void main(String[] args){
        List<Integer> transactionIds = Arrays.asList(1069, 1070, 1071, 1072);
        List<Invoice> invoices = transactionIds.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());
        invoices.forEach(System.out::println);
    }
}
