package org.example;

public class Main {
    public static void main(String[] args) {
        Post post = new Post(
                new FormDate(1, 1, 1990),
                "Иван",
                "4444 № 44444444",
                "Иванович",
                "+7 (999)-999-99-99",
                "Иванов",
                true);
        System.out.println(post.showInfo());
    }
}
