package zoopark;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoopark {

	
	public static void main(String[] args) {
		// создаем объект для генерации коллекции
		CollectionsGenerator collectGenerate = new CollectionsGenerator();
		// генерируем коллекцию из 10 элементов
		collectGenerate.generateArrayList(10);
		// 100
		collectGenerate.generateArrayList(100);
		
		collectGenerate.generateArrayList(1000);
		
		collectGenerate.generateArrayList(10000);
		// 100000
		collectGenerate.generateArrayList(100000);
		
		System.out.println("Запись коллекций в log файлы успешно завершена");
	}
    

}