package ru.skypro;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        System.out.println("Автор книги" + " " + tolstoy.getAuthorName());
        Book voinaImir = new Book("Война и Мир", tolstoy, 1867);
        System.out.println("Год публикации был = " + voinaImir.getPublishingYear());
        voinaImir.setPublishingYear(2022);
        System.out.println("Год публикации стал = " + voinaImir.getPublishingYear());
        System.out.println(voinaImir.getBookName() + " " + voinaImir.getPublishingYear());

        System.out.println();
        Author pushkin = new Author("Александр", "Пушкин");
        System.out.println("Автор книги" + " " + pushkin.getAuthorName());
        Book ruslanIlyudmila = new Book("Руслан и Людмила", pushkin, 1820);
        System.out.println(ruslanIlyudmila.getBookName() + " " + ruslanIlyudmila.getPublishingYear());
        System.out.println("Год публикации был = " + ruslanIlyudmila.getPublishingYear());
        ruslanIlyudmila.setPublishingYear(2022);
        System.out.println("Год публикации стал = " + ruslanIlyudmila.getPublishingYear());

    }
}
