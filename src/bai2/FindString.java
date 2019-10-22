package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindString {
    private static final String SEPARATOR = ",";
    public static void main(String[] args) {
        cau1();
        cau31();
       // cau4();
        cau41();
        cau5();
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
        int indexFirst=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== ch){
                indexFirst=i;
                break;
            }
        }
        System.out.println("Vị trí đầu tiên: " + indexFirst);
        int indexLast=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== ch){
                indexLast=i;
            }
        }
        System.out.println("Vị trí cuối cùng " + indexLast);
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
        int[] dem = new int[26];
        for (int i = 0; i < str.length(); i++) {
            dem[str.charAt(i) - 'a']++;
        }
        int max = 0;
        int asckt = 0;
        for (int j = 0; j < dem.length; j++) {
            if (dem[j] > max) {
                max = dem[j];
                asckt = j;
            }
        }
        char kt = (char) (asckt + 97);
        System.out.println(kt + " max= " + max);

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        String str1 = "";

        for (int i = 2; i < str.length(); i++) {
            for (int m = 0; m <= str.length() - i; m++) {
                for (int j = m; j < i + m; j++) {
                    str1 += str.charAt(j);
                }
                if (hashMap.get(str1) == null) {
                    hashMap.put(str1, 1);
                } else {
                    hashMap.put(str1, hashMap.get(str1).intValue() + 1);
                }

                str1 = "";
            }
        }
        System.out.println(hashMap);

    }

    public static void cau31(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("raw");
        list.add("from");
        list.add("to");

        StringBuilder builder = new StringBuilder();
        for(String text : list){
            builder.append(text);
            builder.append(SEPARATOR);
        }
        String castToStr = builder.toString();
        castToStr = castToStr.substring(0, castToStr.length() - SEPARATOR.length());
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
