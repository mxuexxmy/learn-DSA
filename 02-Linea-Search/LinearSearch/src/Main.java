public class Main {
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int location = linearSearch.search(arr, 2);
        System.out.println(location);
    }
}