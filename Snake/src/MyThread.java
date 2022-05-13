public class MyThread extends Thread{

    Snake snake = new Snake();
    private boolean useAddMethod = true;

    public void addToX(){
        this.snake.StartX++;
        if(snake.StartX > 1080)
            useAddMethod = false;
    }

    public void subToX(){
        this.snake.StartX--;
        if(snake.StartX < 0)
            useAddMethod = true;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (useAddMethod)
                this.addToX();
            else
                this.subToX();
        }
    }
}

