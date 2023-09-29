package AlgoritmaDanStrukturData.Pertemuan5;

public class Tugas1 {
    public int[] arr;
    
    public Tugas1(int[] data){
        arr=new int[data.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=data[i];
        }
    }

    public int cari(int keyword){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (keyword==arr[i]) {
                index=i;
                break;
            } else{
                if(keyword<arr[i]){
                    break;
                }
            }
        } return index;
    }

    public void tampilkan(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        } System.out.println("");
    }
}
