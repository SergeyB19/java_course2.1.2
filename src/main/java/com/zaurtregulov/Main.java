package com.zaurtregulov;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        BigDecimal bigDecimal = null;
        BigDecimal Dwalin = scanner.nextBigDecimal();
        BigDecimal Balin = scanner.nextBigDecimal();
        BigDecimal Thorin = scanner.nextBigDecimal();

        BigDecimal totalGold = Dwalin.add(Balin).add(Thorin);
        System.out.println("totalGold: " + totalGold);
    }
}