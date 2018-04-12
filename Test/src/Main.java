
import javax.swing.*;

import java.awt.event.*;

import javax.swing.event.*;
import javax.swing.table.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.dnd.*;
import java.awt.datatransfer.*;
import java.awt.*;
import java.util.ArrayList;



public class Main 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>() ;
		list.add("0") ;
		list.add("1") ;
		list.add("3") ;
		System.out.println(list.indexOf("3"));
		list.remove("0") ;
		System.out.println(list.indexOf("1"));
		System.out.println(list.size());
	}
}




