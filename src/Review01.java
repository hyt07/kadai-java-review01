
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double tax = 0.1;
        int total;
        total = price + tax(price, tax);
        System.out.println(price + "円の商品の税込み価格は" + total + "円(消費税は" + tax(price, tax) + "円)です。");

    }
    public static int tax(int price, double tax) {
        int result = (int) (price * tax);
        return result;
    }

}
