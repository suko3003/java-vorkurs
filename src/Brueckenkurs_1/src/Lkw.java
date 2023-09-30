package Brueckenkurs_1.src;

import static java.lang.System.out;

public class Lkw {

    private final String brand;
    private final int maxLoading;
    private int loading;
    private boolean isDriverActive;

    public Lkw(String lkwBrand, int maxLkwLoading, boolean isLkwDriverActive) {
        this.brand = lkwBrand;
        this.maxLoading = maxLkwLoading;
    }

    protected void loading(int amount) {
        int newLoading = this.loading + amount;
        if (amount < 0 || newLoading > this.maxLoading) {
            out.println("Wrong amount");
            return;
        }
        this.loading = newLoading;
        out.println("Loading: " + this.loading);
    }

    protected void removeLoading(int amount) {
        int newLoading = this.loading - amount;
        if (amount < 0 || newLoading < 0) {
            out.println("Wrong amount");
            return;
        }

        if (newLoading < maxLoading) {
            this.loading = newLoading;
        }
        out.println("Loading: " + this.loading);
    }

    protected void driverCheckIn() {
        this.isDriverActive = true;
    }

    protected void driverCheckOut() {
        this.isDriverActive = true;
    }

    protected void getLkwData() {
        out.println(this.brand + ", loading: " + this.loading + ", maxLoading: " + this.maxLoading +
                ", isDriverActive: " + this.isDriverActive);
    }
}
