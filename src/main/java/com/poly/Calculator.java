package com.poly;

public class Calculator {
    // Phép cộng
    public int add(int a, int b) {
        return a + b;
    }

    // Phép trừ
    public int subtract(int a, int b) {
        return a - b;
    }

    // Phép nhân
    public int multiply(int a, int b) {
        return a * b;
    }

    // Phép chia
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        return (double) a / b;
    }
}