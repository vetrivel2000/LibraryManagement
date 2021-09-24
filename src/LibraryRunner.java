import com.Books;
import com.Member;
import logical.LogicalLayer;

import java.util.HashMap;
import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        LogicalLayer logical= new LogicalLayer();
        int option;
        do {
            System.out.println("1.AddBook\n2.SearchByName\n3.SearchByAuthor\n4.PrintMembers");
            option=scan.nextInt();
            switch (option)
            {
                case 1:
                {
                    System.out.println("Enter the bookName");
                    String title=scan.next();
                    System.out.println("Enter Id");
                    int id=scan.nextInt();
                    System.out.println("Enter author");
                    String author=scan.next();
                    System.out.println("Enter publication date");
                    String publicationDate=scan.next();
                    System.out.println("Enter rackNumber");
                    int rackNumber=scan.nextInt();
                    Books books = new Books();
                    books.setBookId(id);
                    books.setAuthor(author);
                    books.setDate(publicationDate);
                    books.setTitle(title);
                    books.setDueDate(publicationDate);
                    books.setRackNumber(rackNumber);
                    logical.loadToMap(books);
                    logical.loadToAuthorMap(books);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter your MemberId");
                    int id=scan.nextInt();
                    System.out.println("Enter the bookName youWant to search");
                    String name = scan.next();
                    HashMap<String, HashMap<Integer, Books>> searchMap= logical.getSearchMap();
                    if(searchMap.get(name)==null)
                    {
                        System.out.println("No books");
                    }
                    System.out.println(searchMap.get(name));
                    System.out.println("Enter bookId");
                    int bookId=scan.nextInt();
//                    HashMap<Integer,Member> members= logical.getMemberMap();
                    Member member=new Member();
                    HashMap<Integer,Books> booksMap= logical.getBooksMap();
                    Books book=booksMap.get(bookId);
                    member.setMemberId(id);
                    member.setBooks(book);
                    logical.loadToMemberMap(member);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter your MemberId");
                    int id=scan.nextInt();
                    System.out.println("Enter the authorName youWant to search");
                    String authorName = scan.next();
                    HashMap<String, HashMap<Integer, Books>> searchMap= logical.getSearchMap();
                    if(searchMap.get(authorName)==null)
                    {
                        System.out.println("No books");
                    }
                    System.out.println(searchMap.get(authorName));
                    System.out.println("Enter bookId");
                    int bookId=scan.nextInt();
//                    HashMap<Integer,Member> members= logical.getMemberMap();
                    Member member=new Member();
                    HashMap<Integer,Books> booksMap= logical.getBooksMap();
                    Books book=booksMap.get(bookId);
                    member.setMemberId(id);
                    member.setBooks(book);
                    logical.loadToMemberMap(member);
                    break;
                }
                case 4:
                {
                    System.out.println("Enter memberId:");
                    int id=scan.nextInt();
                    HashMap<Integer,Member> members= logical.getMemberMap();
                    System.out.println(members.get(id));
                    break;
                }
            }
        }while (option<5);
    }
}
