package _09_binarySearch;
//ques : If the square root of the number exists, return the square root,if it doesnt exist, return the last greatest number.
//for example : sqrt(7)≈2.64575131
//so return 2.
public class _04_sqrt {
    public static void main(String[] args) {
        int num=15;
        int lo=1;
        int hi=15;
        int ans=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(mid*mid>num){
                hi=mid-1;
            }
            else if(mid*mid<num){
                ans=mid;
                lo=mid+1;
            }
            else{
                ans=mid;
            }
        }
        System.out.println(ans);
    }
}

//better to take long hi , long lo , long ans , long mid , instead of int as big numbers will give us overflow error


//instead this problem doesnt neccesarily mean that we have to use long , we can use int too but just from now onwards , we will use int mid = lo + (hi-lo)/2;
