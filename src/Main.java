import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, answer, yeni;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz: ");
        userName = inp.nextLine();

        System.out.println("Şifrenizi giriniz: ");
        password = inp.nextLine();

        if(userName.equals("mehmetkaan") && password.equals("123")) {
            System.out.println("Giriş yaptınız!");
        }else{
            System.out.println("Kullanıcı adınız veya şifreniz yanlış");
            System.out.print("Şifrenizi sıfırlamak ister misiniz? : ");
            answer = inp.nextLine();
            if(answer.equals("evet")){
                System.out.println("Yeni şifrenizi giriniz: ");
                yeni = inp.nextLine();
                if(yeni.equals("123")){
                    System.out.println("Şifre oluşturulamadı lütfen başka bir şifre giriniz");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }

        }

    }
}