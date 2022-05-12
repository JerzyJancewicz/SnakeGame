public class MyThread extends Thread{

    private int x;
    private boolean useAddMethod = true;

    public int getX() {
        return x;
    }

    public void addToX(){
        this.x++;
        if(x>500)
            useAddMethod = false;
    }

    public void subToX(){
        this.x--;
        if(x<0)
            useAddMethod = true;
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (useAddMethod)
                this.addToX();
            else
                this.subToX();

            System.out.println(this.getX());
        }
    }
}

