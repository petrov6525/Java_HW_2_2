package Task_3;

public class Money {
    protected int whole;
    protected String whole_type;
    protected int coins;
    protected String coins_type;

    public Money(int whole, String whole_type, int coins, String coins_type) {
        this.whole = whole;
        this.whole_type = whole_type;
        this.coins = coins;
        this.coins_type = coins_type;
    }

    public int getWhole() {
        return whole;
    }

    public void setWhole(int whole) {
        this.whole = whole;
    }

    public String getWhole_type() {
        return whole_type;
    }

    public void setWhole_type(String whole_type) {
        this.whole_type = whole_type;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public String getCoins_type() {
        return coins_type;
    }

    public void setCoins_type(String coins_type) {
        this.coins_type = coins_type;
    }
}

