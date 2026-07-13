//public class Show {
    import java.util.ArrayList;
import java.util.List;

    public class Show {
        private String title;
        private int duration;
        private Director director;
        private List<Actor> listOfActors;

        public Show(String title, int duration, Director director) {
            this.title = title;
            this.duration = duration;
            this.director = director;
            this.listOfActors = new ArrayList<>();
        }

        public String getTitle() { return title; }
        public int getDuration() { return duration; }
        public Director getDirector() { return director; }
        public List<Actor> getListOfActors() { return listOfActors; }

        public void addActor(Actor actor) {
            if (listOfActors.contains(actor)) {
                System.out.println("Предупреждение: Актёр " + actor + " уже добавлен в спектакль \"" + title + "\"!");
                return;
            }
            listOfActors.add(actor);
        }

        public void replaceActor(Actor newActor, String oldActorSurname) {
            int indexToReplace = -1;
            for (int i = 0; i < listOfActors.size(); i++) {
                if (listOfActors.get(i).getSurname().equalsIgnoreCase(oldActorSurname)) {
                    indexToReplace = i;
                    break;
                }
            }

            if (indexToReplace == -1) {
                System.out.println("Предупреждение: Актёр с фамилией " + oldActorSurname + " не найден в спектакле \"" + title + "\"!");
                return;
            }

            listOfActors.set(indexToReplace, newActor);
        }

        public void printActors() {
            System.out.println("Список актёров спектакля \"" + title + "\":");
            if (listOfActors.isEmpty()) {
                System.out.println(" - Список пуст");
            } else {
                for (Actor actor : listOfActors) {
                    System.out.println(" - " + actor);
                }
            }
        }

        public void printDirectorInfo() {
            System.out.println("Режиссёр спектакля \"" + title + "\": " + director);
        }
    }


