Создание классов: mkdir target & javac -d target ./src/java/edu/school21/printer/app/* ./src/java/edu/school21/printer/logic/*
Копирование изображение: mkdir target\resources & copy src\resources\image.bmp target\resources\
Создание Jar-файла: cd target & jar cfev images-to-chars-printer.jar edu/school21/printer/app/Program edu/school21/printer/app/Program.class edu/school21/printer/logic/Convert.class resources/image.bmp & cd ..
Запуск программы: java -jar target/images-to-chars-printer.jar 0 " "