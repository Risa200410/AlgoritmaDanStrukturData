package AlgoritmaDanStrukturData.Pertemuan5;

public class Tugas3 {
    public int [] data;
    public int jumData;

    public Tugas3 (int Data[], int jmlData){
        jumData=jmlData;
        data= new int [jmlData];
        for (int i=0; i<jumData; i++){
            data[i]=Data[i];
        }
    }
    
    void bubbleSort(){
        int temp=0;
        for(int i=0; i<jumData-1; i++){
            for (int j=1; j<jumData-i; j++){
                if (data[j-1]>data[j]){
                    temp = data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }

    public void tampilData(){
        for (int i=0; i<jumData; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public int terkecil() {
        int min = data[0];
        for (int i = 1; i < jumData; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public int terbesar() {
        int max = data[0];
        for (int i = 1; i < jumData; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }
}
