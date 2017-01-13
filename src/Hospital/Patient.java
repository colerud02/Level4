package Hospital;

public class Patient {
Boolean tof = false;
Boolean dead = false;
	public Object feelsCaredFor() {
if (tof == true) {
	return true;
}		return false;
	}

	public void checkPulse() {
tof = true;		
	}

	public Object isAlive() {
if (dead = true) {
	return false;
}
		return true;
	}

	public void kill() {
		dead = true;
		
	}

}
