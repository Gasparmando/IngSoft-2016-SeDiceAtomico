package TestDrive;
import Controller.BeatController;
import Controller.ControllerInterface;
import Controller.HeartController;
import Model.BeatModel;
import Model.BeatModelInterface;
import Model.HeartModel;

public class DJTestDrive {

	@SuppressWarnings("unused")
	public static void main (String[] args) {
	//HeartModel heartModel = new HeartModel();
    //ControllerInterface model = new HeartController(heartModel);
    	
    /**Se modifico la creación del HeartModel*/
    HeartModel HeartUnico = HeartModel.getInstancia();
	ControllerInterface model = new HeartController(HeartUnico);
    }
}
