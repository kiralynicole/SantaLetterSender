import controller.Controller;
import view.GiftsView;
import view.SenderView;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SenderView senderView = new SenderView();
		GiftsView giftsView = new GiftsView();
		Controller controller = new Controller(senderView, giftsView);
		senderView.setVisible(true);
		giftsView.setVisible(false);
	}

}
