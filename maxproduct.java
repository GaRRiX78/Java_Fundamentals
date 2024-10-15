public class maxproduct {
    public static void main(String[] args){
        int arr[]={2,3,5};
        int n=arr.length;
        int f=0;int r=0;int max=0;
        for(int i=0;i<n;i++)
        {
            if(f==0)
                f=1;
            if(r==0)
                r=1;
            f=f*arr[i];
            r=r*arr[n-i-1];
            max=Math.max(max,Math.max(f,r));
        }
        System.out.println(max);
    }
}

