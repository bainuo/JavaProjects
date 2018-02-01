package zoopark;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.stream.LongStream;

public class CollectionsGenerator {
	// поле генератора случайных чисел
	private Random rand = null;
	
	public CollectionsGenerator() {
		rand = new Random(); // в конструкторе создание объекта Random
	}
        
        // метод создает объект Животных с помощью случайных чисел (i - номер элемента в коллекции)
	public Animals generateAnimalsObject(int i) {
		// переменная под объект животные
		Animals v = null;
		// i % 4 создаем Bird, ColdBlooded, Ungulates, Waterfowl
		switch (i % 4) {
			case 0:
				v = new Bird(i + 1, generateStringName(), 10000 + rand.nextInt(10000));
				break;
			case 1:
				v = new ColdBlooded(i + 1, generateStringName(), 900 + rand.nextInt(600));
				break;
			case 2:
				v = new Ungulates(i + 1, generateStringName(), 150 + rand.nextInt(400));
				break;
			case 3:
				v = new Waterfowl(i + 1, generateStringName(), 100 + rand.nextInt(10000));
				break;
		}
		
		return v;
	}
        
        // набор случайных символов английского алфавита длиной от 5 до 21 символов
        // Mетод генерации случайных значений для класса Животного
	private String generateStringName() {
		
		int length = 5 + rand.nextInt(16);
		
		String name = "";
		
		for (int i = 0; i < length; i++)
			name += (char)('B' + rand.nextInt(26));
		
		return name;
	}
	
	// метод генерирует коллекцию из n элементов, пишет лог и возвращает коллекцию
	public ArrayList<Animals> generateArrayList(int n) {
		
		long startTime; // переменная для хранения времени начала добавления элемента в коллекцию
		// массив, в котором будет хранится время
		long[] time = new long[n];
		// сама коллекция
		ArrayList<Animals> animals = new ArrayList<Animals>();
		// FileWriter - пишет в файл
		try (FileWriter fw = new FileWriter("log" + n + ".txt")) {
			// записываем время начала
			fw.write("Start program: " + (new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date())) + 
					"\r\n");
			
			fw.write("ArrayList" + "\r\n");
			// в цикле создаем коллекцию
			for (int i = 0; i < n; i++) {
                                Animals generateAnimalVar = generateAnimalsObject(i);
				startTime = System.nanoTime(); // время начала создания элемента коллекции
				animals.add(generateAnimalVar); // генерируем объект животных и добавляем в коллекцию
				time[i] = System.nanoTime() - startTime; // время завершения
			}
			// записываем в лог время для каждого элемента
			for (int i = 0; i < n; i++) {
				fw.write("add, ID = " + (i + 1) + ", " + time[i] + "\r\n");
			}
			// число элементов
			fw.write("addTotalCount = " + n + "\r\n");
			// общее время 
			fw.write("addTotalTime = " + LongStream.of(time).sum() + "\r\n");
			// сортируем массив по возрастанию
			Arrays.sort(time);
			// записываем медианнное время (это средний элемент отсортированного массива)
			fw.write("addMedianTime = " + time[n / 2] + "\r\n");
			// пишем время завершения работы программы
			fw.write("Finish program: " + (new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date())) + 
					"\r\n");
		}
		catch (IOException exc) {
			System.out.println("I/O Error: " + exc);
		}
		// возвращаем коллекцию
		return animals;
	}
	
	
	
	
}
