package ge.edu.btu.chat.server;

import java.util.Scanner;

public class ServerThread implements Runnable {

    @Override
    public void run() {
        System.out.println("მიმდინეარეობს კავშირის დამყარება ...");
        Scanner in = new Scanner(System.in);
        label:
        while(true) {
            System.out.println("დასვი კითხვა: ");
            String clientQuestion;
            clientQuestion = in.next();
            switch (clientQuestion) {
                case "გამარჯობა":
                    System.out.println("პასუხი: მოგესალმებით, რით შემიძლია დაგეხმაროთ");
                    break;
                case "მაჩვენე კურსი":
                    System.out.println("პასუხი: 3.3021");
                    break;
                case "მაჩვენე ფილიალები":
                    System.out.println("[ი.ჭავჭავაძის გამზ, ვ.ფშაველას გამზ, გურამიშვილის გამზ.]");
                    break;
                case "ნახვამდის":
                    System.out.println("პასუხი: გმადლობთ რომ დაგვიკავშირდით, ნახვამდის!!!");
                    break label;
                default:
                    System.out.println("პასუხი: სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს");
                    break;
            }
        }
        System.out.println("კავშირის დასასრული !!!");
    }
}
