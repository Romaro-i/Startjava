\c robots
-- выводим всю таблицу
SELECT * FROM jaegers;

-- отображаем только не уничтоженных роботов
SELECT * From jaegers WHERE status = 'active';

-- отобразите роботов нескольких серий, например Mark-1 и Mark-6
SELECT * FROM jaegers WHERE mark SIMILAR TO '(mark - 1|mark - 6)%';

-- отобразите самого старого робота
SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

-- отобразите роботов, которые уничтожили больше/меньше всех kaiju
SELECT * FROM jaegers WHERE kaijuKilled = (SELECT MAX(kaijuKilled) FROM jaegers);
SELECT * FROM jaegers WHERE kaijuKilled = (SELECT MIN(kaijuKilled) FROM jaegers);

-- отобразите средний вес роботов
SELECT AVG(weight) FROM jaegers;

-- увеличьте на единицу количество уничтоженных kaiju у роботов, которые до сих пор не разрушены
UPDATE jaegers SET kaijukilled = kaijukilled + 1 WHERE status = 'active';
SELECT * FROM jaegers;

-- удалите уничтоженных роботов
DELETE FROM jaegers WHERE status = 'destroyed';
SELECT * FROM jaegers;