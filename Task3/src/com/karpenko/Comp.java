
package com.karpenko;

/**
 * @author Nestea
 *
 */
import java.io.Serializable;
public class Comp implements Serializable{
	/**
	 * версия сериализации
	 */
	private static final long serialVersionUID = 1L;
	private double cpu;
	private double memory;
	private double videoCard;
	
	Comp(){
		
	}
	Comp(double cpu, double memory, double videoCard){
		this.cpu=cpu;
		this.memory=memory;
		this.videoCard=videoCard;
	}
	
	public double getCpu() {
		return cpu;
	}
	
	public void setCpu(double cpu) {
		this.cpu=cpu;
	}
	
	public double getMemory() {
		return memory;
	}
	
	public void setMemory(double memory) {
		this.memory=memory;
	}
	
	public double getVideoCard() {
		return videoCard;
	}
	
	public void setVideoCard(double videoCard) {
		this.videoCard=videoCard;
	}
	
	public double perfomance() {
		return (cpu / memory + videoCard) * memory;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cpu = " + cpu + 
				", Memory =" + memory + 
				", Video Card =" + videoCard + 
				", Perfomance=" + perfomance();
	}
}
