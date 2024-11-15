public class swapstr {
    public static void main(String[] args) {
        swap("Utkarsh", "Dhruv"); //calling the function
    }
    static void swap(String name1, String name2) { //void as nothing is returned
        String temp = name1; //storing strq in temp
        name1 = name2; //storing str2 in str1
        name2 = temp; //storing temp(str1) in str2
        System.out.println(name1 + " " + name2); //printing
    }
}
