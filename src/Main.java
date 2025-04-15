public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var weightBoxer1 = 78.2;
        System.out.println("Вес первого боксера " + weightBoxer1 + "кг!");
        var weightBoxer2 = 82.7;
        System.out.println("Вес второго боксера " + weightBoxer2 + "кг!");
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес " + totalWeight + "кг!");
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе между бойцами " + weightDifference + "кг!");
        var reminderFromDivision = weightBoxer2 % weightBoxer1;
        System.out.println("Остаток от деления между двумя весами составляет " + reminderFromDivision + "кг!");
        var totalWorkingTime = 640;
        System.out.println(totalWorkingTime + " - общие рабочие часы всех сотрудников.");
        var oneEmploerkingTime = 8;
        System.out.println(oneEmploerkingTime + "- рабочие часы 1 сотрудника.");
        var totalNumOfEmploers = totalWorkingTime / oneEmploerkingTime;
        System.out.println("Всего работников в компании — " + totalNumOfEmploers + "человек!");
        var moreEmploers = totalNumOfEmploers + 94;
        System.out.println("C увеличением количества работников в компании работает — " + moreEmploers + "человек!");
        var newWorkingTime = moreEmploers * 8;
        System.out.println("Если в компании работает " + newWorkingTime + "человек, то всего " + newWorkingTime + "часов работы может быть поделено между сотрудниками.");

    }

}