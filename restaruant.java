import java.util.Scanner;

public class restaruant {
    int tea=10;
    int coffee=15;
    int snacks=10;
    int idli=8;
    int dosa=6;

    public restaruant(int tea, int coffee, int snacks, int idli, int dosa) {
        this.tea = tea;
        this.coffee = coffee;
        this.snacks = snacks;
        this.idli = idli;
        this.dosa = dosa;
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
        System.out.println("Enter 1-Add count\n2-Generate bill\n3-view all transactions\n4-exit");
        int choice= sc.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter order details: ");
                break;
            case 2:
                System.out.println("Your bill");
                break;
            case 3:
                System.out.println("All transactions");
                break;
            case 4:System.exit(0);
            default:
                System.out.println("Invalid invoice");
        }
    }
}
