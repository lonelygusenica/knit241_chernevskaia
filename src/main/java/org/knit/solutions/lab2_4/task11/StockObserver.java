package org.knit.solutions.lab2_4.task11;

interface StockObserver {
    void update(Stock stock, double oldPrice, double newPrice);
}