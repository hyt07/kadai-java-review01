
public class Review01 {

    public static void main(String[] args) {
        int price = 1500;
        double tax = 0.1;
        int total;
        int taxPrise =tax(price, tax);
        total = price + taxPrise;
        System.out.println(price + "円の商品の税込み価格は" + total + "円(消費税は" + taxPrise + "円)です。");

    }
    public static int tax(int price, double tax) {
        int result = (int) (price * tax);
        return result;
    }

}
