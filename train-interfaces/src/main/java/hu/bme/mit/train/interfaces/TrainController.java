package hu.bme.mit.train.interfaces;

public interface TrainController {

	void followSpeed();

	int getReferenceSpeed();

	void setSpeedLimit(int speedLimit);

	void decreaseReferenceSpeed(int num);

	void setJoystickPosition(int joystickPosition);

}
