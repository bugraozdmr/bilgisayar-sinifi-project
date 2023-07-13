import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class test
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        gpu gpu1=new gpu("Nvidia",4,"GTX 1650");
        cpu cpu4=new cpu("none",16,"ryzen 5600h");
        anakart anakart1=new anakart("B550-Ma","Msi",32,cpu4,"intel");


        bilgisayar pc2=new bilgisayar(cpu4,gpu1,anakart1);

        int u=0;
        while(u==0){
            System.out.print("Bilgisayarı açmak için 1'e bas :");
            int a=scanner.nextInt();
            if(a==1){
                pc2.pc_ac();
                break;
            }else continue;
        }
        scanner.nextLine();





        //işlemci çalıştıktan sonra takılamaz tabi
        while(true){
            System.out.print("Takılacak işlemci modeli :");
            String a=scanner.nextLine();
            cpu4.setUretici(a);
            //zaten tekte hallolur
            if(anakart1.islemci_gir(pc2)==1) break;
        }

        System.out.println("\n\n\n\n\n\nSistem hazırlanıyor lütfen bekleyin ...\n\n");
        System.out.println("      J       A       V       V       A");
        System.out.println("      J      A A       V     V       A A");
        System.out.println("  J   J     AAAAA       V   V       AAAAA");
        System.out.println("   J J     A     A       V V       A     A");
        System.out.println("    J     A       A       V       A       A");

        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("\n\n\n");
        int y=0;
        while (true){
            System.out.print("Sistem bilgisi yazmak için 1'e bas :");
            y=scanner.nextInt();
            if(y==1) {
                System.out.println("\n\n\nSistem Bilgisi");
                pc2.yazdir();
                break;
            }
            else continue;
        }
    }
}
