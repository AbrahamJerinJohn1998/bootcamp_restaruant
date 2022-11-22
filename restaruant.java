import java.util.ArrayList;
import java.util.Scanner;

public class restaruant {
    int tea=10;
    int coffee=15;
    int snacks=10;
    int idli=8;
    int dosa=6;
    int teacount,coffecount,snackscount,idlicount,dosacount,tprice;
    String name;
    long phno;

    public restaruant(String name, long phno, int teacount, int coffeecount, int snackscount, int idlicount, int dosacount) {
        this.name=name;
        this.phno=phno;
        this.teacount = teacount;
        this.coffecount = coffeecount;
        this.snackscount = snackscount;
        this.idlicount = idlicount;
        this.dosacount = dosacount;


    }
public int totalprice()
{
    tprice=(teacount*tea)+(coffecount*coffee)+(snackscount*snacks)+(idlicount*idli)+(dosacount*dosa);
    return tprice;
}
    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getSnacks() {
        return snacks;
    }

    public void setSnacks(int snacks) {
        this.snacks = snacks;
    }

    public int getIdli() {
        return idli;
    }

    public void setIdli(int idli) {
        this.idli = idli;
    }

    public int getDosa() {
        return dosa;
    }

    public void setDosa(int dosa) {
        this.dosa = dosa;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<restaruant> arr = new ArrayList<restaruant>();
        int a=0,tprice;
        while (a!=1) {
            System.out.println("Enter 1-Add count\n2-Generate bill\n3-view all transactions\n4-exit");
            int choice= sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter order details: ");
                    System.out.println("Enter customer name: ");
                    String name= sc.next();
                    System.out.println("Enter customer phone no: ");
                    long phno= sc.nextLong();
                    System.out.println("Enter count");
                    System.out.println("Tea: ");
                    int teacount = sc.nextInt();
                    System.out.println("Coffee: ");
                    int coffeecount = sc.nextInt();
                    System.out.println("Snacks: ");
                    int snackscount = sc.nextInt();
                    System.out.println("Idli: ");
                    int idlicount = sc.nextInt();
                    System.out.println("Dosa: ");
                    int dosacount = sc.nextInt();
                    restaruant obj=new restaruant(name,phno,teacount,coffeecount,snackscount,idlicount,dosacount);
                    tprice=obj.totalprice();
                    arr.add(obj);
                    break;

                case 2:
                    System.out.println("Your bill");
                    for (restaruant rest:arr
                         ) {
                        System.out.println(rest.name);
                        System.out.println(rest.phno);
                        System.out.println("Tea: "+rest.teacount);
                        System.out.println("Coffee: "+rest.coffecount);
                        System.out.println("Snacks: "+rest.snackscount);
                        System.out.println("Idli: "+rest.idlicount);
                        System.out.println("Dosa: "+rest.dosacount);
                        System.out.println("Total Price"+rest.tprice);
                    }
                    break;
                case 3:
                    System.out.println("All transactions");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid invoice");
            }
            System.out.println("Enter 0 to continue or 1 to exit");
            a= sc.nextInt();
        }
    }
}
