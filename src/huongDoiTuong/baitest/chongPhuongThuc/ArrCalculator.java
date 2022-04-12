package huongDoiTuong.baitest.chongPhuongThuc;

public class ArrCalculator {

        public static int maxOfArray(int []arr){
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
        public static double maxOfArray(double []arr){
            double max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        }
        public static int minOfArray( int []arr){
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
        }
        public static double minOfArray(double[]arr){
            double min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min=arr[i];
                }
            }
            return min;
        }
        public static void main(String[]args){
            int []arr1= new int[] {2,4,-2,4,7,12};
            double []arr2=new double []{ 2.4,23,1.3,74};
            System.out.println(ArrCalculator.maxOfArray(arr1));
            System.out.println(ArrCalculator.maxOfArray(arr2));
            System.out.println(ArrCalculator.minOfArray(arr1));
            System.out.println(ArrCalculator.minOfArray(arr2));
        }




}
