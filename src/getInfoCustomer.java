import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collector;

public class getInfoCustomer {
    Scanner sc = new Scanner(System.in);
    ArrayList<Bill> billList = new ArrayList<Bill>();

    public void inPut() {
        System.out.println("Nhập vào số lượng hóa đơn: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập vao ma hoa don: " + i);
            int id = sc.nextInt();
            System.out.println("Nhap vao ten hoa don: ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Nhap vao so tien: ");
            int money = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhap vao ngay thang: ");
            String time = sc.nextLine();
            Bill hoadon = new Bill(id, name, money, time);
            billList.add(hoadon);
        }
    }

    public void sortMoney() {
        Collections.sort(billList, new MoneyComparator());
        System.out.println("Danh sách sắp xếp tiền theo chiều tăng dần:");
        for (Bill bill : billList) {
            System.out.println(bill.getMoney());
        }
    }

    public List<Bill> getListGreat1000() {
        List<Bill> listBill = new ArrayList<>();
        System.out.println("Danh sách hóa đơn có tiền lớn hơn 1000000: ");
        for (int i = 0; i < billList.size(); i++) {
            if (billList.get(i).getMoney() > 1000000) {
                System.out.println("Hóa đơn " + billList.get(i).getId());
                Bill bill = billList.get(i);
                listBill.add(bill);
            }
        }
        return listBill;
    }

    public void cau4() {
        List<Bill> listBill = new ArrayList<>();
        Bill b1 = new Bill(6, "abc", 3200, "24/2/2019");
        Bill b2 = new Bill(2, "xyz", 1100000, "27/2/2019");
        Bill b3 = new Bill(23, "he", 1100000, "24/2/2019");
        listBill.add(b1 );
        listBill.add(b2);
        listBill.add(b3);
        Set<String> bills = new HashSet<>();
        for (Bill bill : listBill) {
            bills.add(bill.getDate());
        }
        System.out.println(bills);

    }



    public void cau6() {
        List<Bill> listBill = new ArrayList<>();
        Bill b1 = new Bill(6, "abc", 3200, "24/2/2019");
        Bill b2 = new Bill(2, "xyz", 1100000, "27/2/2019");
        Bill b3 = new Bill(23, "he", 1100000, "24/2/2019");
        listBill.add(b1 );
        listBill.add(b2);
        listBill.add(b3);
        HashMap<String, List<Bill>> hashMap = new HashMap<String, List<Bill>>();
        for(int i = 0; i< listBill.size(); i++){
            List<Bill> bills = new ArrayList<>();
            if(hashMap.containsKey(listBill.get(i).getDate())==true){
                bills = hashMap.get(listBill.get(i).getDate());
            }
            bills.add(listBill.get(i));
            hashMap.put(listBill.get(i).getDate(),bills);
        }
        for (String dayb : hashMap.keySet()) {
            System.out.println("key: " + dayb + " value: " + hashMap.get(dayb));
        }
    }

}
