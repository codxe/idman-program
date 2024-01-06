
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
   String idmanlar = "idman programına hoş geldiniz \n"
           + "idmanlar sırasıyla :\n"
           + "Burpee\n"
           + "pushup\n"
           + "situp\n"
           + "squad\n";
     System.out.println(idmanlar);
     System.out.println("bir idman oluşturum :");
     
     System.out.println("Burpee sayısı :");
     int Burpee = scanner.nextInt();
     
     System.out.println("pushup sayısı :");
     int pushup = scanner.nextInt();
     
     System.out.println("situp sayısı :");
     int situp = scanner.nextInt();
     
     System.out.println("squad sayısı :");
     int squad = scanner.nextInt();   
     
     scanner.nextLine();
           
     idman antreman = new idman(Burpee, pushup, situp, squad);
     
     System.out.println("idmanınız başlıyor");
     while(antreman.idmanBittimi() == false){
         System.out.println("idman türünü seçiniz(Burpee,pushup,situp,squad)");
         String tür = scanner.nextLine();
         System.out.println("bu hareketten kaç tane yapacaksınız :");
         int sayi = scanner.nextInt();
         scanner.nextLine();
         antreman.hareketYap(tür, sayi);
         System.out.println("çıkış için q basın veya mola için p basın");
         String islem = scanner.nextLine();
         if (islem.equals("q")) {
             break;
         }
         if (islem.equals("p")) {
             System.out.println("20 saniye sonra devam edin\n"
                     + "***********************");
             break;
         }
     }
}
  
}
