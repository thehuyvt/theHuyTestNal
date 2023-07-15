import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void countVietNameseCharacter(String str){
        String arrTest[] = {"aw", "aa", "dd", "ee", "oo", "w"};
        String arr[] = str.split("");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length()-1; i++) {
            if(i == str.length()-1 && arr[i].equals("w")){
                result.add("w");
                System.out.println(i);
                break;
            }
            for (int j = 0; j < arrTest.length; j++) {
                if((arr[i]+arr[i+1]).contains(arrTest[j])){
                    result.add(arrTest[j]);
                    System.out.println(i);
                    if ((i+2) < str.length()-1){
                        i++;
                    }
                    break;
                }
            }

        }
        if(result.size() > 0){
            System.out.print(result.size()+ " (");
            for (int i = 0; i < result.size()-1; i++) {
                System.out.print(result.get(i) + ", ");
            }
            System.out.println(result.get(result.size()-1)+")");
        }else{
            System.out.println("Chuoi tren khong co chu cai tieng viet nao!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap chuoi: ");
        String str = sc.next();
        countVietNameseCharacter(str);
    }
}
