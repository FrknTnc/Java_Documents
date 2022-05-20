public class Dog {


    String name;

    public void bark(String name){

        this.name = name;

        System.out.println(this.name + " barks.. Woof!");
    }

    public void wakeTheNeighbors(){
        int i=50;
        String name = "ALfido";
        while(i>0){
            bark(name);
            i--;
        }
    }
}
