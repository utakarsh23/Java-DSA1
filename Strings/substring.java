public class substring {
    public static void main(String[] args) {
        String sus = "Tiwari"; //surname
        String srr[] = {"Shresth Tiwari", "Vatsalya Tiwari", "Vatsalya Khan", "Vatsalya Singh", "Utkarsh Tiwari", "Utkarsh Tripathi"}; //name in arrays
        for (String srr1 : srr) {
            //loop for checking the surname in the array
            int length = srr1.length(); //length of the string in the array
            int sur = sus.length(); //length of the surname
            if (srr1.substring(length-sur).equals(sus)) {
                //checking if the surname is present in the string //length-sur = 12-6 = 6, 13-6 = 7, 13-6 = 7, 13-6 = 7, 13-6 = 7, 15-6 = 9
                System.out.println(srr1); //printing the string if the surname is present
            }
        }
    }
}
