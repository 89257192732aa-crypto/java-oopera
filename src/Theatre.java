//public class Theatre {
    public class Theatre {
        public static void main(String[] args) {
            // 1. Создание участников
            Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
            Actor actor2 = new Actor("Анна", "Петрова", Gender.FEMALE, 165);
            Actor actor3 = new Actor("Сергей", "Сергеев", Gender.MALE, 175);

            Director director1 = new Director("Режиссёр", "Первый", Gender.MALE, 10);
            Director director2 = new Director("Режиссёр", "Второй", Gender.MALE, 5);

            String musicAuthor = "Пётр Чайковский";
            String choreographer = "Мариус Петипа";

            // 2. Создание спектаклей
            Show regularShow = new Show("Гамлет", 120, director1);
            Opera operaShow = new Opera("Травиата", 150, director2, "Джузеппе Верди", "Драматическая история любви...", 40);
            Ballet balletShow = new Ballet("Лебединое озеро", 140, director1, musicAuthor, "История о принцессе, превращенной в лебедя...", choreographer);

            System.out.println("=== 3. Распределение актёров ===");
            regularShow.addActor(actor1);
            regularShow.addActor(actor2);

            // Проверка дубликата
            regularShow.addActor(actor1);

            operaShow.addActor(actor2);
            operaShow.addActor(actor3);

            balletShow.addActor(actor1);
            balletShow.addActor(actor3);

            System.out.println("\n=== 4. Вывод списков актёров ===");
            regularShow.printActors();
            operaShow.printActors();
            balletShow.printActors();

            System.out.println("\n=== 5. Замена актёра (Петрова -> Сергеев в Гамлете) ===");
            regularShow.replaceActor(actor3, "Петрова");
            regularShow.printActors();

            System.out.println("\n=== 6. Попытка замены несуществующего актёра ===");
            operaShow.replaceActor(actor1, "Сидоров");

            System.out.println("\n=== 7. Вывод либретто ===");
            operaShow.printLibretto();
            System.out.println();
            balletShow.printLibretto();
        }
    }


