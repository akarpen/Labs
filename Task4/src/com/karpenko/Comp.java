
package com.karpenko;

/**
 * @author Nestea
 *
 */
import java.io.Serializable;
public class Comp implements Serializable{
	/**
	 * версия класса
	 */
	private static final long serialVersionUID = 1L;
	private double cpu;
	private double memory;
	private double videoCard;
	
	Comp(){
		
	}
	Comp(double cpu, double memory, double videoCard) throws PerfomanceException{
		if (cpu <=0) {
			throw new PerfomanceException ("Error! CPU is entered incorrectly.",cpu);
		}
		if (memory<=0) {
			throw new PerfomanceException ("Error! Memory is entered incorrectly.",memory);
		}
		if (videoCard <=0) {
			throw new PerfomanceException ("Error! VideoCard is entered incorrectly.",videoCard);
		}
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
	
	public double getPerfomance() {
		return (cpu / memory + videoCard) * memory;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cpu = " + cpu + 
				", Memory = " + memory + 
				", Video Card = " + videoCard + 
				", Perfomance = " + getPerfomance();
	}
}
