//finding the char which is > the target element inside the array(Ceiling)
//passes 132 test cases
// public class Leetcode_Ceiling_char { 
//         public static void main(String[] args) {
//             char[] letters = {'c', 'f', 'j'}; 
//             char target = 'k';
//             System.out.println(nextGreatestLetter(letters, target));
//         }
//         static char nextGreatestLetter(char[] letters, char target) { 
//             int start = 0; 
//             int end = letters.length -1; 
//             if(target >= letters[end]) {
//                 return letters[start];
//             }
//             while(start <= end) {
//                 int mid = start - (start-end)/2; 
//                 if(target > letters[mid]) { 
//                     start = mid + 1; 
//                 } else if(target< letters[mid]) { 
//                     end = mid -1; 
//                 } else {
//                     return letters[mid+1];
//                 }
//             }
//             return letters[end+1]; 
//         } 
//     }
//
//finding the char which is > the target element inside the array(Ceiling)
//
//the correct code 
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/solutions/
public class Leetcode_Ceiling_char {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target));
        System.out.println(1%3);
    }
    static char nextGreatestLetter(char[] letters, char target) { //func for returning character next to the target element
        int start = 0;  //start initialising 0;
        int end = letters.length -1; // end = length of the array
        while(start <= end) { //condition,,, loop will break when the start will be greater than end
            int mid = start - (start-end)/2; //mid = (start+end)/2
            if(target < letters[mid]) { //if target > letters[mid] that means the target is on the right side so increasing
                 end = mid -1;  //the starting point to next to the ending point(s:1, 2, 3, 4, 5, e:6), t = 5; a[m] = 3<t
                //so the target is on the right so we increase start point without changing the last index,
                //start = mid+1; end = letters.length-1
            } else {
                start = mid + 1; //if target < arr[mid] then it appeals to be on the left side and we dec the end: mid-1, start: 0
            }
        } //after the loop breaks this value will be returned
        return letters[start % letters.length]; //letters[start% letters.length] /// tar = k, arr[3%3] = 0, arr[0] = c
    } //tar = f, arr[2%3] = 2, arr[2] = j, //tar = c, arr[1%3] = 1, arr[1] = f,
}
