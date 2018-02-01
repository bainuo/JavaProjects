package graphtest;

import java.awt.*; //импортируем библиотеки для создания графического интерфейса
import java.awt.geom.*;
import javax.swing.*;


public class GraphTest { //в этом классе мы создаем объект формы, а также указываем title и закрытие по щелчку на X

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            EventQueue.invokeLater(new Runnable() { // показать окошко когда все ресурсы готовы.

            public void run() {
                GraphFrame frame = new GraphFrame();
                frame.setTitle("ArrayList add() graphics");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

class GraphFrame extends JFrame {
    GraphFrame() { //конструктор в котором
        setLayout(new FlowLayout()); //метод просто рисует в строку все компоненты в том порядке, в котором они были помещены в контейнер
        add(new GraphTotal()); //добавляем график общего времени
        add(new GraphMedian()); //добавляем график среднего времени
        pack();//запускаем процедуру упаковки
    }
}

class GraphTotal extends JComponent { //рисуем график общего времени
    
    static final String[] xlabs = {"10","100","1000","10000","100000"}; //объявляем массивы как константы
    static final double[] tottimes = {0.062417,0.020193,0.130112,0.600274,2.490668};
    public Dimension getPreferredSize() {return new Dimension(550,500);} //задаем размер компонента

    public void paintComponent(Graphics g) { //метод рисования графика

        Graphics2D g2 = (Graphics2D) g; //создаем объект g2 для двухмерного рисования
        g2.setFont(new Font("Arial", Font.ITALIC, 18));
        g2.drawString("ArrayList add() Total time",150,20);
        g2.drawLine(0,450,520,450); //ось x
        g2.drawLine(50,0,50,500); // ось y
        g2.setFont(new Font("Arial", Font.PLAIN, 14));

        for(int i=0; i<5; i++) {
            int ix = i*100 + 100; //отмеряем координату по оси x
            g2.drawLine(ix, 440, ix, 460); // рисуем вертикальные черточки
            g2.drawString(xlabs[i], ix-10, 470); //подписываем черточку
        }
        
        

        double scale = 400/tottimes[4]; //делаем масштаб для наших плавающих точек

        for(int i=0; i<5; i++) {

            int ix0 = i*100 + 100;
            int iy0 = 450 - (int)(tottimes[i]*scale);
            g2.drawRect(ix0-2, iy0-2, 4, 4); //рисуем прямоугольник

            if(i<4) {
                int ix1 = (i+1)*100 + 100; //задаем координаты следующей точки и рисуем между ними линию
                int iy1 = 450 - (int)(tottimes[i+1]*scale);
                g2.drawLine(ix0, iy0,ix1, iy1);
            }

        }

    }

}



class GraphMedian extends JComponent { //рисуем график среднего времени
    
    static final String[] xlabs = {"10","100","1000","10000","100000"};
    static final double[] medtimes = {0.006242,0.000202,0.000130,0.000060,0.000025};
    public Dimension getPreferredSize() {return new Dimension(550,500);} //задаем размер компонента

    public void paintComponent(Graphics g) { //рисуем график

        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(new Font("Arial", Font.ITALIC, 18)); //задаем шрифт с наклоном
        g2.drawString("ArrayList add() Median time",150,20); //выводим подпись
        g2.drawLine(0,450,520,450); //ось x
        g2.drawLine(50,0,50,500); // ось y
        g2.setFont(new Font("Arial", Font.PLAIN, 14)); //обычный шрифт

        for(int i=0; i<5; i++) { //рисуем черточки
            int ix = i*100 + 100;
            g2.drawLine(ix, 440, ix, 460);
            g2.drawString(xlabs[i], ix-10, 470);
        }

        double scale = 400/medtimes[0]; //шкала

        for(int i=0; i<5; i++) {

            int ix0 = i*100 + 100;
            int iy0 = 450 - (int)(medtimes[i]*scale);
            g2.drawRect(ix0-2, iy0-2, 3, 3);

            if(i<4) {
                int ix1 = (i+1)*100 + 100;
                int iy1 = 450 - (int)(medtimes[i+1]*scale);
                g2.drawLine(ix0, iy0,ix1, iy1);
            }

        }

    }

}