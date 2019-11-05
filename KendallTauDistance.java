//KendallTauDistance by Isabella Rolfe
//11/05/19
public class KendallTauDistance {
    //assumption contain permutations of same element
    public static int calculatektd(int[] a, int[] b){
        int counter=0;
        for(int x=0;x<a.length;x++){
            for(int y=x+1; y<a.length;y++){
                if(a[x]<a[y]!=b[x]<b[y]){
                    counter++;
                }
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={3,4,1,2,5};
        System.out.println(calculatektd(a,b));
    }
}
