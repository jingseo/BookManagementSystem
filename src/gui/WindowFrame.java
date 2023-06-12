package gui;

import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import ss.BookManager;
public class WindowFrame extends JFrame{

	BookManager bookManager;
	
	MenuSelection menuselection;
	BookAdder bookadder;
	BookViewer bookviewer;

	public WindowFrame(BookManager bookManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.bookManager = bookManager;
		menuselection = new MenuSelection(this);
		bookadder = new BookAdder(this);
		bookviewer = new BookViewer(this, this.bookManager);
		
		
		this.add(menuselection);
		
		this.setVisible(true);
		
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}


	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public BookAdder getBookadder() {
		return bookadder;
	}

	public void setBookadder(BookAdder bookadder) {
		this.bookadder = bookadder;
	}

	public BookViewer getBookviewer() {
		return bookviewer;
	}

	public void setBookviewer(BookViewer bookviewer) {
		this.bookviewer = bookviewer;
	}


}
