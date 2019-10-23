import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Bill implements Serializable {
    private int id;
    private String name;
    private long money;
    private String date;

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", date='" + date + '\'' +
                '}';
    }

    public Bill() {
    }

    public Bill(int id, String name, long money, String date) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


        @Override
        public boolean equals(Object bill){
            if(bill instanceof Bill){
                Bill another = (Bill) bill;
                if(this.id==another.id && this.name.equals(another.name)){
                    return true;
                }

            }
            return false;
        }

        public int hashCode(){
            return 31+name.hashCode();
        }

}
