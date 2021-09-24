package com;

import java.util.ArrayList;

public class Member {
    private int memberId;
    private ArrayList<Books> books=new ArrayList<>();

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public ArrayList<Books> getBooks() {
        return books;
    }

    public void setBooks(Books book) {
        books.add(book);
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", books=" + books +
                '}';
    }
}
