/*Вывести все простые числа от 1 до 1000 */


public class Hw1_task2 {
    public static void EasyNumber(){
        int countDelitel;
        for (int x = 1; x <= 1000; x ++) {
            countDelitel = 0;
            for (int i = 1; i <= x; i ++) {
                if (x % i == 0){
                    countDelitel ++;
                }    
            }
            if (countDelitel <= 2){
                System.out.print(x + " ");
            }
            
        }
    }
        public static void main(String args[]) { 
                EasyNumber();
        }
}
