package bookcontent.it03;


public class Simulator {
        public void playSound(Animal animal){
            System.out.print("播放"+animal.getAnimalName()+"类声音:");
            animal.cry();
        }
    }


