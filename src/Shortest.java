public class Shortest {
    public static void main(String[] args) {
        String sentences = "I am a software engineer";
        String shortestWord = findShortestString(sentences);
        System.out.println("The shortest word in the sentence is: " + shortestWord);
    }

    public static String findShortestString(String name) {
        String[] words = name.split(" ");
        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        return shortestWord;
    }
}
