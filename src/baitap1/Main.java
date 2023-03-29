package baitap1;

public class Main {
    public static void main(String[] args) {

    }
    public void insertSort(int[] list){
        for (int i = 0; i < list.length; i++) {
//            tạp biến tạm để so sánh;
            int temp = list[i];
//            khởi taọ j để sau khi kết thúc vòng for j ta vẫn có thể sử dụng j;
            int j;
            for ( j = i-1; j >=0 && list[j]> temp; j--) {
                    list[j]=list[j+1];
            }
            list[j+1]=temp;
        }
    }
}
