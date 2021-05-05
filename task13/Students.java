package task13;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Students {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("\nNguyen Hoang Anh");
        names.add("\nBui Huu Thanh");
        names.add("\nDuong Quoc Viet");
        names.add("\nTran Van Duong");
        names.add("\nPham Thanh Dat");
        //set
        names.set(4, "\nĐạt nghiện");
        System.out.println("Danh sách nhóm sau khi đổi tên: " + names);
        //Remove
        names.remove(4);
        System.out.println("\nDanh sách team sau khi đuổi thằng Đạt nghiện ra khỏi nhóm: " + names);


        //Check
        System.out.println("\nDoes names array contain \"Dat\"? : " + names.contains("Dat"));

        //for each
        System.out.println("=== Iterate using Java 8 forEach and lamba ===");
        names.forEach(name -> {
            System.out.println(name);
        });

        //while


    }
}
