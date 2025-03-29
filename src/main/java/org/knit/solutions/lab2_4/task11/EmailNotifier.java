package org.knit.solutions.lab2_4.task11;

public class EmailNotifier implements StockObserver {
    private final String email;

    public EmailNotifier(String email) {
        this.email = email;
    }

    @Override
    public void update(Stock stock, double oldPrice, double newPrice) {
        System.out.println("EmailNotifier [" + email + "]: Акция " + stock.getCompanyName() +
                " изменилась с " + oldPrice + " на " + newPrice);
    }
}
