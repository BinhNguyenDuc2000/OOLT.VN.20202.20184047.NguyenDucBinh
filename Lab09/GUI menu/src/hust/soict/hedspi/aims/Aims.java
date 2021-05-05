package hust.soict.hedspi.aims;
import java.util.Collections;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;

public class Aims extends JFrame{
	private static final long serialVersionUID = 1L;
	private JTextArea ta;
	private JButton btnCD;
	private JButton btnDVD;
	private JButton btnAdd;
	private JButton btnRemove;
	java.util.Collection<Media> order = new java.util.ArrayList<Media>();
	
	public Aims() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.CENTER));
		cp.add(new Label("text area"));
		ta = new JTextArea(40,60);
		ta.setEditable(false);
		cp.add(ta);
		btnCD = new JButton("CD demo");
		cp.add(btnCD);
		
		btnCD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(Aims.CD());	
			}
		});
		
		btnDVD = new JButton("DVD demo");
		cp.add(btnDVD);
		
		btnDVD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.setText(Aims.DVD());
			}
		});
		
		btnAdd = new JButton("Add");
		cp.add(btnAdd);
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String type = JOptionPane.showInputDialog("Please type in the type of the media");
				String name = JOptionPane.showInputDialog("Please type in the name of the media");
				String category = JOptionPane.showInputDialog("Please type in the category of the media");
				float cost = Float.parseFloat(JOptionPane.showInputDialog("Please enter the cost of the Media"));
				switch (type) {
				case "book":
				case "Book":
				case "BOOK":
					order.add(new Book(name, category,cost));
					
					break;
				case "CD":
				case "Compact Disc":
					order.add(new CompactDisc(name, category, cost));
					break;
				case "DVD":
				case "Digital Video Disc":
					order.add(new DigitalVideoDisc(name, category,cost));
					break;
				default:
					JOptionPane.showMessageDialog(null, "There is no such type");
					break;
				}
				ta.setText(allOrder());
			}
		});
		
		btnRemove = new JButton("Remove");
		cp.add(btnRemove);
		
		btnRemove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog("What is the name of the media?");
				java.util.Iterator<Media> iterator = order.iterator();
				while(iterator.hasNext()) {
					Media m = iterator.next();
					if (m.getTitle().equals(name)==true) {
						order.remove(m);
						System.out.println("The item is removed");
						break;
					}
				}
				ta.setText(allOrder());
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Aims");
		setSize(1200,900);
		setVisible(true);
		
	}
	
	final public static String DVD() {
		java.util.Collection<Media> DVDcollection	= new java.util.ArrayList<Media>();
		String s="";
		
		// Add objects to the arraylist
		DVDcollection.add(new DigitalVideoDisc("hello", "science", 12f, 5, "sir"));
		DVDcollection.add(new DigitalVideoDisc("world","science",1f,7,"Alex"));
		DVDcollection.add(new DigitalVideoDisc("my","action",9f,4,"Feb"));
		DVDcollection.add(new Book("apple"));
		
		// Iterate through the ArrayList and output
		// (unsorted order)
		java.util.Iterator<Media> iterator = DVDcollection.iterator();
		
		s+="-----------------\n";
		s+="The DVD in unsorted order:\n";
		
		while (iterator.hasNext()) {
			s+=iterator.next().getTitle()+"\n";
			
		}
		
		// After sort
		s+="-----------------\n";
		s+="The DVD in sorted order:\n";
		Collections.sort((List<Media>)DVDcollection);
		iterator = DVDcollection.iterator();
		while (iterator.hasNext()) {
			s+=iterator.next().getTitle()+"\n";
		}
		return s;
	}
	final public static String CD() {
		java.util.Collection<Media> CDcollection	= new java.util.ArrayList<Media>();
		String s="";
		
		// Add objects to the arraylist
		CompactDisc cd1 = new CompactDisc("hello", "sad", 0f, 10, "n/a");
		CompactDisc cd2 = new CompactDisc("hello5", "sad", 0f, 10, "n/a");
		CompactDisc cd3 = new CompactDisc("hello4", "sad", 0f, 10, "n/a");
		CompactDisc cd4 = new CompactDisc("hello3", "sad", 0f, 10, "n/a");
		cd1.addTrack(new Track("pog", 100));
		cd1.addTrack(new Track("poggies", 10));
		cd1.addTrack(new Track("pogger",14));
		cd2.addTrack(new Track("pog", 90));
		cd3.addTrack(new Track("pog", 100));
		cd4.addTrack(new Track("pog", 100));
		CDcollection.add(cd1);
		CDcollection.add(cd2);
		CDcollection.add(cd3);
		CDcollection.add(cd4);
		CDcollection.add(new DigitalVideoDisc("world","science",1f,7,"Alex"));
		CDcollection.add(new DigitalVideoDisc("my","action",9f,4,"Feb"));
		CDcollection.add(new Book("apple"));
		
		// Iterate through the ArrayList and output
		// (unsorted order)
		java.util.Iterator<Media> iterator = CDcollection.iterator();
		
		s+="-----------------\n";
		s+="The CD in unsorted order:\n";
		
		while (iterator.hasNext()) {
			s+=iterator.next().getTitle()+"\n";
			
		}
		
		// After sort
		s+="-----------------\n";
		s+="The CD in sorted order:\n";
		Collections.sort((List<Media>)CDcollection);
		iterator = CDcollection.iterator();
		while (iterator.hasNext()) {
			s+=iterator.next().getTitle()+"\n";
		}
		return s;
		
	}
	
	public String allOrder() {
		String s="";
		s+="-----------------\n";
		s+="The order in sorted order:\n";
		Collections.sort((List<Media>)order);
		java.util.Iterator<Media> iterator = order.iterator();
		while (iterator.hasNext()) {
			Media m=iterator.next();
			s+=m.getClass()+"\n"+m.getTitle()+
					"-"+m.getCategory()+
					"-"+m.getCost()+"\n";
		}
		s+="-----------------\n";
		return s;
	}
	
	public static void main(String[] args) {
		// Run the GUI construction in the Event-Dispatching thread for thread-safety
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Aims(); // Let the constructor do the job
			}
		});
	}
}
