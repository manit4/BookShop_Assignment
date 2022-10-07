package com.bookshop;

import java.util.Scanner;

import com.bookshop.pojo.Book;
import com.bookshop.pojo.User;

public class Runner {
	
	public static void main(String[] args) {
		
		User falguni = new User("fal@123", "12345", "Falguni", "fal@gmail.com");
		User stephenson = new User("step@234", "23456", "Stephenson", "steph@yahoo.com");
		User ali = new User("ali@345", "34567", "Ali", "ali@reddit.com");
		
		Book book1 = new Book(100, "Attitude is Everything", "Falguni", 100);
		Book book2 = new Book(101, "Java for Dummies", "Stephenson", 134);
		Book book3 = new Book(102, "Harry Potter", "J.K Rowling", 122);
		Book book4 = new Book(103, "The Man who knew Infinity", "David N. Schwartz", 200);
		
		Book books[] = { book1, book2, book3, book4};
		
		User[] users = {falguni, stephenson, ali};
		
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			
			System.out.println("Please Enter your Username!!");
			
			String username = sc.next();
			
			System.out.println("Please Enter your Password!!");
			
			String password = sc.next();
			
			
			for(int i = 0; i < users.length; i++) {
				
				if(username.equals(users[i].getUsername()) && password.equals(users[i].getPassword())) {
					System.out.println("Logged-In successfully!!");
					
					System.out.println("Username is: "+users[i].getUsername()+", Name is: "+users[i].getName()+", Email is: "+users[i].getEmail());
					
					boolean mainMenuFlag= true;
					
					while(mainMenuFlag) {
					
						System.out.println("Press 1 to see all the books avaialable OR Press 2 to see specific book details by book-id OR 0 to Terminate!!");
						
						int value = sc.nextInt();
						
						if(value == 1) {
							
							for(int j = 0; j < books.length; j++) {
								
								System.out.println("Book id "+books[j].getBookId()+" Book Name is "+books[j].getBookName()+" "+books[j].getAuthorName()+" "+books[j].getPrice());
							}
						}
						else if (value == 2) {
							
							boolean booksearchFlag = true;
							
							while(booksearchFlag) {
							
								System.out.println("Enter the Book-Id to see specific book details!!");
								
								int bookId = sc.nextInt();
								
								for(int j = 0; j < books.length; j++) {
									
									if(bookId == books[j].getBookId()) {
										System.out.println("Book id "+books[j].getBookId()+" Book Name is "+books[j].getBookName()+" "+books[j].getAuthorName()+" "+books[j].getPrice());
										booksearchFlag = false;
										break;
									}
									else {
										if(j == books.length-1) {
											System.out.println("Book Not Found..");	
										}
										
									}
								}
							}	
						}
						else {
							System.out.println("Good Bye..");
							break;
						}
					}
					
					
					
					flag = false;
					break;
				}
				else {
					
					if(i == users.length-1) {
						System.out.println("Wrong credentials, please try again!!");	
					}
					
				}
			}
			
			
			
			
			
//			if(username.equals("Manit") && password.equals("123")) {
//				System.out.println("Logged-in successfully..");
//				//flag = false;
//			}
//			else {
//				System.out.println("Wrong Credentials, please try again!!");
//			}
		}
		
	}

}
