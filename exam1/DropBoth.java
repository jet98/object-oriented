public class DropBoth implements Ifilter{
    public int[] filter(int[] ary){
        int high = ary[0];
        int low = ary[0];
        for(int i = 1; i < ary.length; i++){
            int temp2 = ary[i];
            if(temp2 < low)
                low = temp2;
            if(temp2 > high)
                high = temp2;
        }
        int[] x = new int[ary.length - 2];
        int index = 0;
        for(int i = 0; i < ary.length; i++){
            if(ary[i] != high || ary[i] != low){
                x[index] = ary[i];
                index++;
            }
        }
        return x;
    }
}