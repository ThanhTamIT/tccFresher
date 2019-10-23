package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindString {
    private static final String SEPARATOR = ",";
    public static void main(String[] args) {
       // cau1();
       // cau31();
        cau2();
       // cau4();
       // cau41();
       // cau5();
    }

    public static void cau1() {
        String str = "abcabdef";
        char ch = 'a';
        int n = 5;
        int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                dem++;
            }
        }
        System.out.println("So lan xuat hien cua ky tu " + ch + ": " + dem);
        System.out.println("Vị trí đầu tiên: " + str.indexOf('a'));
        System.out.println("Vị trí cuối cùng " + str.lastIndexOf('a'));
        System.out.println("Ky tu xuat hien vi tri thu " + n + ": " + str.charAt(n));
        //abcabdef
        String str1 = "abd";
        dem = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1.charAt(0)) {
                int j = i + 1;
                boolean check = true;
                for (int j2 = 1; j2 < str1.length(); j2++) {
                    if (str.charAt(j) != str1.charAt(j2)) {
                        check = false;
                        break;
                    }
                    j++;
                }
                if (check == true) {
                    dem++;
                }
            }
        }
        System.out.println("So lan xuat hien cua chuoi " + str1 + ": " + dem);

    }
    public static void cau2() {
        String str = "abcffdeff";
        HashMap<Character, Integer> hashMap1 = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap1.containsKey(str.charAt(i)) == false) {
                hashMap1.put(str.charAt(i), 1);
            } else {
                hashMap1.put(str.charAt(i), hashMap1.get(str.charAt(i)).intValue() + 1);
            }
        }
        int max =0;
        char kt=' ';
        for (Character ch : hashMap1.keySet()) {
            if (hashMap1.get(ch) > max){
                max = hashMap1.get(ch);
                kt = ch;
            }
        }

        System.out.println(kt + " max= " + max);

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        String str1 = "";
        for(int i = 2; i < str.length(); i++){
            for (int j = 0; j <= str.length() - i; j++){
                str1 = str.substring(j,j+i);
            if (hashMap.containsKey(str1) == false) {
                hashMap.put(str1, 1);
            } else {
                hashMap.put(str1, hashMap.get(str1).intValue() + 1);
            }
            }
        }

        System.out.println(hashMap);


    }

    public static void cau31(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("raw");
        list.add("from");
        list.add("to");
        String castToStr = String.join(",", list);
        System.out.println(castToStr);
    }

//    public static void cau4(){
//        String text = "I, am, Thanh, Tam";
//        String r = text.replace(", "," ");
//        System.out.println(r);
//
//        String string = "004-034556";
//        String[] parts = string.split("3");
//        String part1 = parts[0];
//        String part2 = parts[1];
//        System.out.println(part1);
//        System.out.println(part2);
//    }
    public static void cau41(){
        String s = "My name is Tam";

        List<String> myList = new ArrayList<String>(Arrays.asList(s.replace(","," ")));

        System.out.println(myList);
    }
    public static void cau5(){
        String  raw = "I am fresher", from = "fresher" , to = "senior";
        String repalce= raw.replace("fresher", "senior");
        System.out.println(repalce);
    }

}
