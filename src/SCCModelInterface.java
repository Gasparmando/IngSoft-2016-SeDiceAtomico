
public interface SCCModelInterface {
	void on();
	void off();
	int getSpeed();
	void setSpeed(int vpm);  //vpm ->Vueltas por minuto

	
	void registerObserver(BeatObserver o);
	void removeObserver(BeatObserver o);
	void registerObserver(BPMObserver o);
	void removeObserver(BPMObserver o);

}
