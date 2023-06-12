package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import book.BookInput;
import ss.BookManager;
import java.util.Vector;

public class BookViewer extends JPanel {
    WindowFrame frame;
    BookManager bookManager;

    public BookViewer(WindowFrame frame, BookManager bookManager) {
        this.frame = frame;
        this.bookManager = bookManager;

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id");
        model.addColumn("Name");
        model.addColumn("Writer");
        model.addColumn("Contact info.");

        for (BookInput bi : bookManager.getBookList()) {
            Vector row = new Vector();
            row.add(bi.getBookNum());
            row.add(bi.getBookName());
            row.add(bi.getBookWriter());
            model.addRow(row);
        }

        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);

        this.add(sp);
    }
}
