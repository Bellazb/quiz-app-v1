package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        QuestionsAnswers qa = new QuestionsAnswers();
        Scanner input = new Scanner(System.in);
        char ans;
        int wrong = 0, correct = 0;

        // Loop through each question
        for(int i = 0; i < 10; i++) {
            qa.askQuestions(i);
            ans = input.next().charAt(0); // Get user input

            if(ans == qa.getAnswer(i)){
               correct++;
            } else {
                wrong++;
            }
        }
        int percentage = correct * 10;
        System.out.println("Your marks are: " + percentage + " / 100");
    }
}

class QuestionsAnswers {
    private String[] questions = {
            "Which planet is known as the \"Red Planet\"?\n" +
                    "A) Jupiter\n" +
                    "B) Mars\n" +
                    "C) Venus\n" +
                    "D) Saturn",

            "Who wrote the play Romeo and Juliet?\n" +
                    "A) William Shakespeare\n" +
                    "B) Charles Dickens\n" +
                    "C) Jane Austen\n" +
                    "D) Mark Twain",

            "What is the largest organ in the human body?\n" +
                    "A) Heart\n" +
                    "B) Liver\n" +
                    "C) Brain\n" +
                    "D) Skin",

            "In what year did World War II end?\n" +
                    "A) 1940\n" +
                    "B) 1943\n" +
                    "C) 1945\n" +
                    "D) 1950",

            "Which element has the chemical symbol \"O\"?\n" +
                    "A) Gold\n" +
                    "B) Oxygen\n" +
                    "C) Osmium\n" +
                    "D) Octium",

            "How many continents are there in the world?\n" +
                    "A) 5\n" +
                    "B) 6\n" +
                    "C) 7\n" +
                    "D) 8",

            "What is the freezing point of water in Celsius?\n" +
                    "A) 0 degrees\n" +
                    "B) 32 degrees\n" +
                    "C) 100 degrees\n" +
                    "D) -1 degrees",

            "What is the capital city of France?\n" +
                    "A) Berlin\n" +
                    "B) Rome\n" +
                    "C) Madrid\n" +
                    "D) Paris",

            "Which gas do plants absorb from the atmosphere during photosynthesis?\n" +
                    "A) Oxygen\n" +
                    "B) Carbon Dioxide\n" +
                    "C) Nitrogen\n" +
                    "D) Hydrogen",

            "Who was the first president of the United States?\n" +
                    "A) Thomas Jefferson\n" +
                    "B) Abraham Lincoln\n" +
                    "C) George Washington\n" +
                    "D) John Adams"
    };

    private char[] answers = {
            'b', // answer1
            'a', // answer2
            'd', // answer3
            'c', // answer4
            'b', // answer5
            'c', // answer6
            'a', // answer7
            'd', // answer8
            'b', // answer9
            'c'  // answer10
    };

    // Method to display questions dynamically
    void askQuestions(int questionNumber) {
        if (questionNumber >= 0 && questionNumber < questions.length) {
            System.out.println(questions[questionNumber]);
        } else {
            System.out.println("Invalid question number.");
        }
    }

    // Method to get the answer for a specific questtion
    char getAnswer(int questionNumber) {
        if (questionNumber >= 0 && questionNumber < answers.length) {
            return answers[questionNumber];
        } else {
            throw new IndexOutOfBoundsException("Question doesn't have an answer");
        }
    }
}

