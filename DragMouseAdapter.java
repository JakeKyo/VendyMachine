package vendingMachine;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import javax.swing.TransferHandler;

public class DragMouseAdapter extends MouseAdapter  {
	
	public void mousePressed(MouseEvent e) {

        var c = (JComponent) e.getSource();
        var handler = c.getTransferHandler();
        handler.exportAsDrag(c, e, TransferHandler.COPY);
    }
}
	

