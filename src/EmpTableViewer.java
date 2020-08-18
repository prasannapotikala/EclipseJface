

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;


public class EmpTableViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display display = new Display();
		Shell shell = new Shell(display);
		GridLayout layout = new GridLayout();
		shell.setText("Employee Details");
		
		shell.setLayout(layout);
		
		// Create the ScrolledComposite to scroll horizontally and vertically
	    ScrolledComposite scrolledcomposite = new ScrolledComposite(shell, SWT.BORDER| SWT.H_SCROLL| SWT.V_SCROLL);
	    scrolledcomposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

	    // Create a child composite to hold the controls
	    Composite child = new Composite(scrolledcomposite, SWT.NONE);
	    child.setLayout(layout);
	    
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
		
		// creating employee controller object
		EmpTableController03 controller = new EmpTableController03(child);
		
		

			
		
		
		
		
		
		

		    
		   
		    
		    
		// Set the child as the scrolled content of the ScrolledComposite
	    scrolledcomposite.setContent(child);

	    // Set the minimum size
	   scrolledcomposite.setMinSize(800, 500);

	    // Expand both horizontally and vertically
	    scrolledcomposite.setExpandHorizontal(true);
	    scrolledcomposite.setExpandVertical(true);
		
		
		
		shell.open();
		
		while(!shell.isDisposed()) {
			
			if(display.readAndDispatch()) {
				
				display.sleep();
			}
		}
		
		display.dispose();

	}

}
