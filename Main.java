package com.bridgelabz.oops;

import java.util.ArrayList;
import java.util.Scanner;

class Stock {
    String name;
    int numShares;
    double sharePrice;
    double value;

    Stock(String name, int numShares, double sharePrice) {
        this.name = name;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
        this.value = numShares * sharePrice;
    }
}

class StockPortfolio {
    ArrayList<Stock> stocks = new ArrayList<Stock>();
    double totalValue = 0;

    void addStock(Stock stock) {
        stocks.add(stock);
        totalValue += stock.value;
    }

    void generateReport() {
        System.out.printf("%-10s %-15s %-15s %-15s\n", "Name", "Shares", "Price", "Value");
        for (Stock stock : stocks) {
            System.out.printf("%-10s %-15d %-15.2f %-15.2f\n", stock.name, stock.numShares, stock.sharePrice, stock.value);
        }
        System.out.println("Total value of all stocks: " + totalValue);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter the number of stocks: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of the stock: ");
            String name = scanner.next();
            System.out.print("Enter the number of shares: ");
            int numShares = scanner.nextInt();
            System.out.print("Enter the share price: ");
            double sharePrice = scanner.nextDouble();
            Stock stock = new Stock(name, numShares, sharePrice);
            portfolio.addStock(stock);
        }

        portfolio.generateReport();
    }
}










