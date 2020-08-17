


import java.util.ArrayList;

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;


public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display display = new Display();
		Shell shell = new Shell(display);
		GridLayout layout = new GridLayout(1, true);
		layout.numColumns = 1;
		shell.setLayout(layout);
		shell.setSize(750, 450);
		shell.setText("Employee Details");
	
		
		 // Create the ScrolledComposite to scroll horizontally and vertically
	    ScrolledComposite scrolledcomposite = new ScrolledComposite(shell, SWT.BORDER| SWT.H_SCROLL| SWT.V_SCROLL);
	    scrolledcomposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

	    // Create a child composite to hold the controls
	    Composite child = new Composite(scrolledcomposite, SWT.NONE);
	    child.setLayout(new GridLayout(1,true));
		
		 //set Title
	       Label title = new Label(child, SWT.NULL);
	       title.setText("----------------------EMPLOYEE DETAILS-----------------------");
	       title.setSize(100, 100);
	       FontData fontData = title.getFont().getFontData()[0];
	      
	       Font font = new Font(display, new FontData(fontData.getName(), fontData.getHeight(), SWT.BOLD));
	       title.setFont(font);
	      GridData gridData1 = new GridData(GridData.HORIZONTAL_ALIGN_CENTER);
	      gridData1.horizontalSpan = 2 ;
	      title.setLayoutData(gridData1);
	      
	      

	       
		//List Viewer
		final ListViewer v = new ListViewer(child, SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER | SWT.MULTI);
		
		v.setLabelProvider(new LabelProvider());
		v.setContentProvider(ArrayContentProvider.getInstance());
		v.getList().setVisible(true);
		
		
		

		
		
		List<EmployeeModel> elements = new ArrayList<>();


		elements.add(new EmployeeModel("1A001","Mahima",20,25000));
		elements.add(new EmployeeModel("1A002","jyothi",30,25000));
		elements.add(new EmployeeModel("1A003","aishwarya",40,25000));
		elements.add(new EmployeeModel("1A004","Naga Rani",25,25000));
		elements.add(new EmployeeModel("1A005","Jyothna",35,25000));
		elements.add(new EmployeeModel("1A006","Himaja",32,25000));
		elements.add(new EmployeeModel("1A007","Vaishavi",13,25000));
		elements.add(new EmployeeModel("1A008","Sindhu",23,25000));
		elements.add(new EmployeeModel("1A009","Divya",24,25000));
		elements.add(new EmployeeModel("1A010","Pournami",30,25000));

	
		v.setInput(elements);
		
		//Add
		
		Button Add = new Button(child, SWT.PUSH);
	    Add.setText("Add");
	    
	    GridData   gridData = new GridData(GridData.HORIZONTAL_ALIGN_CENTER);

	       gridData.horizontalSpan = 1;

	       Add.setLayoutData(gridData);
	    
	   
	    
	    Add.addSelectionListener(new SelectionAdapter() {
	    	 public void widgetSelected(SelectionEvent e) {
	    		int i=dialog();
                System.out.println(i);	
                if(i==32) {
	    		 elements.add(new EmployeeModel("1A011", "Manisha", 30, 23000));
		          
		          System.out.println("Added successfully ");
	    		 v.add(elements);
                }
		          v.refresh(false);
		          
		          
		    		
		        }

			private int dialog() {
				// TODO Auto-generated method stub
				
				// create a dialog with ok and cancel buttons and a question icon
		          MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
		          dialog.setText("My inforamtion");
		          dialog.setMessage("Do you really want to add Employee?");

	          // open dialog and await user selection
	          return dialog.open();
				
			}
	    });
	    
        
	    //Remove
	    Button Remove = new Button(child, SWT.PUSH);
	    Remove.setText("Remove");

	    GridData   gridData2 = new GridData(GridData.HORIZONTAL_ALIGN_CENTER);

	       gridData2.horizontalSpan = 2;

	       Remove.setLayoutData(gridData2);

	    
	    Remove.addSelectionListener(new SelectionAdapter() {
	        public void widgetSelected(SelectionEvent e) {
	          IStructuredSelection selection = (IStructuredSelection)v.getSelection();
	          EmployeeModel element = (EmployeeModel)selection.getFirstElement();
	          if(element == null) {
	        	  dialog();
	            System.out.println("Please select a Employee first.");
	            
	            return;
	          }
	         int i =  Dialog();
	         System.out.println(i);
	          if(i==32) {
		          elements.remove(element);

	          v.remove(element);
	          System.out.println("Removed: " + element);
	          }
	          
	          v.refresh(false);
	        }

			private int dialog() {
				// TODO Auto-generated method stub
					
					// create a dialog with ok and cancel buttons and a question icon
			          MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK);
			          dialog.setText("My inforamtion");
			          dialog.setMessage("Please Select Employee");

		          // open dialog and await user selection
		          return dialog.open();
					
				
				
			}

			private int Dialog() {
				// TODO Auto-generated method stub
				
					// create a dialog with ok and cancel buttons and a question icon
			          MessageBox dialog = new MessageBox(shell, SWT.ICON_QUESTION | SWT.OK| SWT.CANCEL);
			          dialog.setText("My inforamtion");
			          dialog.setMessage("Do you really want to Remove Employee?");

		          // open dialog and await user selection
		          return dialog.open();
					
				
				
			}
	      });
	    
	   
	    
	    
	 // Set the child as the scrolled content of the ScrolledComposite
	    scrolledcomposite.setContent(child);

	    // Set the minimum size
	   scrolledcomposite.setMinSize(800, 500);

	    // Expand both horizontally and vertically
	    scrolledcomposite.setExpandHorizontal(true);
	    scrolledcomposite.setExpandVertical(true);
		
	
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}

		display.dispose();

	}

	
}
