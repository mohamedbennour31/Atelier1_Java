import java.util.Scanner;

public class ZooManagement
{
    int nbrCages=20;
    String zooName="my zoo";

    public static void main(String[] args) {

        ZooManagement zm=new ZooManagement();
        Scanner sc=new Scanner(System.in);


        System.out.println("Donnez le nombre de cages");
        while (!sc.hasNextInt()) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre entier.");
            sc.next();
        }
        zm.nbrCages = sc.nextInt();
        sc.nextLine();


        System.out.println("Donnez le nom du zoo");
        while (true) {
            zm.zooName = sc.nextLine();
            if (zm.zooName.trim().isEmpty()) {
                System.out.println("Entrée invalide. Veuillez entrer un nom valide.");
            } else {
                break;
            }
        }

        System.out.println(zm.zooName + " comporte " + zm.nbrCages + " cages");

    }

}

