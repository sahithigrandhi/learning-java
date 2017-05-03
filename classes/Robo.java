package edu.learningJava.classes;

public class Robo {
	private double speed;
	private int memory;
	private String name;

	public Robo(double speed, int memory, String name) {
		super();
		this.speed = speed;
		this.memory = memory;
		this.name = name;
	}
	public Robo(){
		super();
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Robo){
			Robo r=(Robo)obj;
			if((this.speed == r.speed)&&(this.memory == r.memory)&&(this.name.equals(r.name))){
				return true;
			}

		}


		return false;
	}
	@Override
	public String toString() {
		String info="speed:"+speed+"\nmemory:"+memory+ "\nname:"+name;
		return info;
	}




}
