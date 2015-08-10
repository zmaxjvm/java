package dynamic.connectivity;

/**
 * Created by zmax.
 */
public class WeightedQuickUnion {
    int arr[];
    int size[];
    public WeightedQuickUnion(int n){
        arr = new int[n+1];
        size = new int[n+1];
        for(int x=1;x<=n;x++){
            arr[x]=x;
        }
        for(int x=1;x<=n;x++){
            size[x]=1;
        }
    }
    private int root(int x){
        while(arr[x]!=x){
            x=arr[x];
        }
        return x;
    }
    public boolean connected(int x,int y){
        return(root(x)==root(y));
    }
    public void union(int x,int y){
//In this method that weighting takes place make sure you understand this method properly
        int rootx = root(x);
        int rooty = root(y);
        if(rootx == rooty)
            return;
        if(size[rootx]<size[rooty]){
            arr[rootx]=rooty;
            size[rooty]+=size[rootx];
        }
        else{
            arr[rooty]=rootx;
            size[rootx]+=size[rooty];
        }
    }
    public void status(){
        for(int x=1;x<arr.length;x++){
            System.out.print(arr[x] + " ");
        }
    }
}
