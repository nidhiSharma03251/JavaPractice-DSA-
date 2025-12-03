    import java.util.HashSet;

    public class repeatedElements {
        public static boolean checkRepeated(int numbers[]){
            HashSet <Integer> nums = new HashSet<>();

            boolean flag = false;

            for(int i=0 ; i<numbers.length; i++){
                if (nums.contains(numbers[i])){
                    flag = true;
                    break;
                }else{
                    nums.add(numbers[i]);
                }
            }
            return flag;
        }
        public static void main(String args[]){
            int numbers[] = {1,2,3,4,5,6,7,99,35,47,87};
            System.out.println(checkRepeated(numbers));
        }
    }
