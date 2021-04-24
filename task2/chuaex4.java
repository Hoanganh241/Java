package task2;

public class chuaex4 {
    public  static  final  int SUB_HEIGHT = 10;

    public static void main(String[] args){
        drawline();
        drawtop();
        drawbottom();
        drawline();
    }

    //
    public  static void drawline(){
        System.out.print("+");
        for (int i = 1; i<= (2* 4); i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
    //
    public static void drawtop(){
        for (int line = 1; line <= 4; line++){
            System.out.print("|");
            for (int i = 1; i <= (line-1); i++){
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int i = 1; i <= (8 -2 * line); i++){
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i <= (line - 1); i++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    //
    public  static  void drawbottom() {
        for (int line = 1; line <= 4; line++){
            System.out.print("|");
            for (int i = 1; i <= (4 - line); i++){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 *(line - 1); i++){
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i <= (4 - line); i++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}
