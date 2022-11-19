package ss04_ClassObject_java.btap;

import java.util.Date;

public class ClassStopWatch {
    private long startTime;
    private long endTime;

    public ClassStopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
         this.startTime=System.currentTimeMillis();
         return this.startTime;
    }

    public long getEndTime() {
        this.endTime = System.currentTimeMillis();
        return this.endTime;
    }

    public long getElapsedTime() {
       return this.endTime-this.startTime;
    }
}

//    StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        System.out.println("Thoi gian bat dau: " + stopWatch.getStartTime());
//    Integer[] arr = {2, 1, 2, 2, 3, 4};
//    int count = 0;
//    Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập phần tử cần xóa: ");
//    Integer itemDelete = scanner.nextInt();
////        stopWatch.start();
////        System.out.println("Thoi gian bat dau: " + stopWatch.getStartTime());
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == itemDelete) {
//            count++;
//            for (int j = i; j < arr.length - 1; j++) {
//                arr[j] = arr[j + 1];
//            }
//            i--;
////                arr[arr.length - count] = 0;
//        }
//    }
//        for (int i = 1; i <= count; i++) {
//        arr[arr.length - i] = 0;
//    }
//        System.out.println(Arrays.toString(arr));
//        stopWatch.stop();
//        System.out.println("Thoi gian ket thuc: " + stopWatch.getEndTime());
//        System.out.println("Thoi gian chenh lech: " + stopWatch.getElapsedTime());
//}
//}
//
//public class StopWatch {
//    private long startTime;
//    private long endTime;
//    public StopWatch(){
//        this.startTime = System.currentTimeMillis();
//    }
//    public long start(){
//        this.startTime = System.currentTimeMillis();
//        return this.startTime;
//    }
//    public long stop(){
//        this.endTime = System.currentTimeMillis();
//        return this.endTime;
//    }
//    public long getElapsedTime(){
//        return this.endTime - this.startTime;
//    }
//    public long getStartTime() {
//        return startTime;
//    }
//    public void setStartTime(long startTime) {
//        this.startTime = startTime;
//    }
//    public long getEndTime() {
//        return endTime;
//    }
//    public void setEndTime(long endTime) {
//        this.endTime = endTime;
//
//}
