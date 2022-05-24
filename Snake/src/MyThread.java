
public class MyThread extends Thread{

    Snake snake = new Snake();

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (snake.getDirection()){
                case 0 :if(snake.getDirection() != 1) {
                    snake.setStartY(snake.getStartY() - snake.getSnakeVy());
                }else break;
                case 1 :if(snake.getDirection() != 0) {
                    snake.setStartY(snake.getStartY() + snake.getSnakeVy());
                }else break;
                case 2 :if(snake.getDirection() != 3) {
                    snake.setStartY(snake.getStartX() - snake.getSnakeVx());
                }else break;
                case 3 :if(snake.getDirection() != 2) {
                    snake.setStartY(snake.getStartX() + snake.getSnakeVx());
                }else break;
            }
        }
    }
}



/*JPanel panelN = new JPanel();
        JPanel panelE = new JPanel();
        JPanel panelS = new JPanel();
        JPanel panelW = new JPanel();
        JPanel panelF = new JPanel();

        Color colorN = new Color(154, 113, 43);
        Color colorE = new Color(154, 113, 43);
        Color colorS = new Color(103, 72, 13);
        Color colorW = new Color(103, 72, 13);
        Color colorF = new Color(145, 141, 137);

        panelN.setBackground(colorN);
        panelE.setBackground(colorE);
        panelS.setBackground(colorS);
        panelW.setBackground(colorW);
        panelF.setBackground(colorF);

        panelN.setPreferredSize(new Dimension(100, 50));
        panelE.setPreferredSize(new Dimension(50, 100));
        panelS.setPreferredSize(new Dimension(100, 50));
        panelW.setPreferredSize(new Dimension(50, 100));
        panelF.setPreferredSize(new Dimension(100, 100));

        //panelF.setLayout(new BorderLayout());

        this.add(panelN, BorderLayout.NORTH);
        this.add(panelE, BorderLayout.EAST);
        this.add(panelS, BorderLayout.SOUTH);
        this.add(panelW, BorderLayout.WEST);
        this.add(panelF, BorderLayout.CENTER);*/