public class SumN {
    private static int tTong(int n){
        int tong=0;
        for(int i=0; i<=n; i++){
            tong+=i;
        }
        return tong;
    }
    public static void main(String[] args) {
        System.out.println(tTong(5));
    }
}
