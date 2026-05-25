package _07_timeAndSpaceComplexity;

public class _06_spaceComplexity1 {
    public static void main(String[] args) {
        //space complexity and auxiliary space
        //space complexity means the total space taken by the code problem
        //auxiliary space means the extra space taken by us to solve any problem

        //if we created an extra array of size "n" in our algorithm, then the
        //auxiliary space = O(n)

        //if we have a question in which there is some array of size n , and we created an array of size n too , then
        //space complexity = O(n)(already there) + O(n){the one we created) = O(n)
        //auxiliary space = O(n)  (the one we created)

        //but suppose if we didnt create any extra array, then
        //space complexity = O(n)(already there) + O(1){the one we created) = O(n)
        //auxiliary space = O(1)  (constant space)
    }
}
