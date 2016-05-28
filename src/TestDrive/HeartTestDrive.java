package TestDrive;
import Controller.ControllerInterface;
import Controller.HeartController;
import Model.HeartModel;

public class HeartTestDrive {

    public static void main (String[] args) {
		HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
