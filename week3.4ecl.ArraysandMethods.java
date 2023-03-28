/*
 * package week3arraysandmethods
 * 
 * public class ArraysandMethods {
 * 
 * public static void main(String[] args)
 * 
 * {
 * 
 * 
 * //1. int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 36}; //a. and b. subtracts 1st
 * and last element and b) added a new int (36) { System.out.println(ages[0] -
 * (ages[ages.length -1])); } int sum = 0; //c. average age for (int age : ages)
 * sum += age; { System.out.println(sum / ages.length);
 * 
 * }
 * 
 * //2. created new array of names. { String[] names = { "Sam", "Tommy", "Tim",
 * "Sally", "Buck", "Bob" };
 * 
 * int sumOfLetters = 0;
 * 
 * //a. looped for avg number letters in each word. b. concat String names
 * together 1 space.
 * 
 * for (int i = 0; i < names.length; i++) { sumOfLetters += names[i].length(); {
 * System.out.println(sumOfLetters); }
 * 
 * sum = sumOfLetters / names.length; { System.out.println(sum); //HELP } // b.
 * // concatNames += names[i] + " "; }
 * 
 * System.out.println(); //Last element in array { //3. //Last element in array
 * 
 * System.out.println("ages[ages.length -1])"); } } //4. first element in array
 * 
 * 
 * 
 * { System.out.println(ages[0]); }}} //HELP //5.Create a new array of int
 * called nameLengths. Write a loop to iterate over the previously created names
 * array and add the length of each name to the nameLengths array. //personal ?
 * what is the difference between paste and raw paste? //HELP // int
 * nameLengths[] = new int[names.length];
 * 
 * //for (int i = 0; i < names.length; i++) {
 * 
 * // nameLengths[i] = names[i].length(); //} //
 * System.out.println(nameLengths[i]);
 * 
 * //} //6HELP. Write a loop to iterate over the nameLengths array and
 * //calculate the sum of all the elements in the array. Print the result to the
 * console.
 * 
 * 7. Write a method that takes a String, word, and an int, n, as arguments and
 * returns the word concatenated to itself n number of times. (i.e. if I pass in
 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
 * 
 * public static String multiplyingString(String str, int num) {
 * System.out.println(multiplyingString("Hard", 2));
 * 
 * String result = ""; for (int i = 0; i < num; i++) { result += str; }return
 * result; } }
 * 
 *  //8. Write a method that takes two Strings, firstName and
 * lastName, //and returns a full name (the full name should be the first and
 * the last name as a String separated by a space). String firstName = "Dolly";
 * String lastName = "Parton"; String fullName = makeFullName(firstName,
 * lastName); private void sysout // TODO Auto-generated method stub
 * 
 * 
 * public static String fullName(String firstName, String lastName) { return
 * firstName + '"' + lastName; }
 */