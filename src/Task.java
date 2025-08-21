public class Task {
    private String name;
    private int progress;

    public Task(String name, int progress){
        this.name = name;
        this.progress = progress;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }
    public int getProgress(){
        return progress;
    }
    public String toString(){
        return name +" ["+progress+"%]";
    }
}
