package Task_3;

public class Product {
    protected String name;
    protected Money price;

    public void printPrice () {
        System.out.println(price.whole + price.getWhole_type() + price.coins + price.getCoins_type());
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public void lessPrice(int delta_whole, int delta_coins){
        if(price.getWhole() < delta_whole ){
            System.out.println("Error");
            return;
        }

        int this_all_coins = price.whole * 100 + price.coins;
        int all_coins = delta_whole * 100 + delta_coins;

        int total_price = this_all_coins - all_coins;

        price.whole = total_price / 100;
        price.coins = total_price % 100;
    }
}
