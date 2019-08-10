package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
public static void main(String[] args) {
	ArrayList<Animal> farm = new ArrayList<>(6);
	for(int i = 0; i < farm.size(); i++) {
		farm.get(i).MakeNoise();
		farm.get(i).move();
	}
}
}
