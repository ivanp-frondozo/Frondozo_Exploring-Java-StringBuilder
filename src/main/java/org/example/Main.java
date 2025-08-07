package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //exercise 1 append()
        //result prediction: "Hello, Cadets!"
        //actual result: "Hello, Cadets!"
        //StringBuilder sb = new StringBuilder("Hello");
        //sb.append(", Cadets!");
        //sb.append(" Welcome to ").append("2025").append(".");
        //System.out.println(sb);
        //explanation: append() directly adds the content to the end of the string builder object

        //exercise 2 insert()
        //result prediction:"Java is really great!"
        //actual result: "Java is really great!"
        //StringBuilder sb = new StringBuilder("Java is great!");
        //sb.insert(8, "really ");
        //System.out.println(sb);
        //explanation: insert() directly puts the specified content to the specified index
        //so it pushes to the right the original character

        //exercise 3 delete()
        //result prediction: "This is ntence.", "Thisis ntence."
        //actual result: "This is entence.", "Thisis entence."
        //StringBuilder sb = new StringBuilder("This is a test sentence.");
        // Deletes " a test"
        //sb.delete(8, 16);
        //System.out.println("After delete(8, 16): " + sb);
        // Deletes the character at index 4 (the ' ')
        //sb.deleteCharAt(4);
        //System.out.println("After deleteCharAt(4): " + sb);
        //explanation: Deletes content starting at specified index and ending at specified index minus 1
        //i.e. delete(x,y-1);


        //exercise 4 replace()
        //result prediction:"I like programming in PyJava."
        //actual result: "I like programming in PyJava"
        //StringBuilder sb = new StringBuilder("I like programming in Python.");
        //sb.replace(24, 30, "Java");
        //System.out.println(sb);
        //explanation: replace() changes char at 24-30 with Java. Even if Java only takes up 4 indexes
        //it does not return an error and automatically deletes the originally used indexes.

        //exercise 5 Method Chaining
        //result prediction: "Ready, Set, rt..."
        //actual result: "Ready, Set, rt..."
        //StringBuilder sb = new StringBuilder("Start");
        //sb.append("...").insert(0, "Ready, Set, ").delete(12, 15);
        //System.out.println(sb);
        //explanation: First, append "..." directly at end of original string, then insert "Ready, Set "
        // starting at 0 index then delete "Sta" which is originally at index 12-14
        //method chaining is possible since it is reconstructing the same string

        //exercise 6 substring(), indexOf(), Non-existing words
        //result prediction: "fox", 16, -1
        //actual result: "fox", 16, -1
        //StringBuilder sb = new StringBuilder("The quick brown fox jumps over the lazy dog.");
        // Substring returns a String, it does not modify the StringBuilder
        //String sub = sb.substring(16, 19);
        //System.out.println("Substring: " + sub);
        // indexOf works just like in String
        //int indexOfFox = sb.indexOf("fox");
        //System.out.println("Index of 'fox': " + indexOfFox);
        // Searching for a word that doesn't exist
        //int indexOfCat = sb.indexOf("cat");
        //System.out.println("Index of 'cat': " + indexOfCat);
        //explanation: substring() gets substring of original content from starting index to ending
        //index minus one, indexOf() returns index of starting character of specified string
        //And if specified content is not found, it will return -1

        //exercise 7 toString()
        //result prediction: "Status: Pending", string immutable exception
        //actual result: Status: Pending - Approved, Status: Pending
        StringBuilder sb = new StringBuilder("Status: ");
        sb.append("Pending");

        // Now, we need a final, unchangeable String
        String finalStatus = sb.toString();

        // Let's try to change the StringBuilder again
        sb.append(" - Approved");

        System.out.println("StringBuilder: " + sb);
        System.out.println("Final String: " + finalStatus);
        //explanation: Initially, I thought finalStatus would point to the same object as sb and would
        //make that object immutable. However, it looks like it created a new, immutable string object
        //thus sb was still appended and finalStatus is not affected and just copies sb before the
        //second append() method.
    }
}