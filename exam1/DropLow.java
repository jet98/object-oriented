public class DropLow implements Ifilter{
    public int[] filter(int[] ary){
        int temp = ary[0];
        for(int i = 1; i < ary.length; i++){
            int temp2 = ary[i];
            if(temp2 < temp)
                temp = temp2;
        }
        int[] x = new int[ary.length - 1];
        int index = 0;
        for(int i = 0; i < ary.length; i++){
            if(ary[i] != temp){
                x[index] = ary[i];
                index++;
            }
        }
        return x;
    }
}