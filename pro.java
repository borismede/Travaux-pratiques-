import java.util.Scanner;
public class pro{
public static void main(String[] args){
System.out.println("Hello World !");
System.out.println("Bienvenue en MI3");
int age = 22;

if (age<=20) {
    System.out.print("Plus d'une vingtaines d'années c'est pas mal");

    
} else { System.out.println("Plus d'une vingtaines d'années c'est pas mal");
}

for (int i = 1; i<=5 ; i++) {
    System.out.println(i);  
}

int j=1;
do { 
    System.out.print("Le produit: ");
    System.out.println(j*10/6);
    //break;
    j++;
} while (j<=3);




Scanner sc = new Scanner(System.in);
    System.out.println("Entrer votre Nom: ");
    String nom = sc.nextLine();
    System.out.println("Bonjour. Mr/Mme "+ nom);
    
 }



}