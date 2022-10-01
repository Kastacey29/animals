public class Main {
    public static void main(String[] args) {
        Herbivores gazel = new Herbivores("Hazel", 2015, "саванна", 2.2, null);
        Herbivores zhiraf = new Herbivores("Zhiraf", 2018, "саванна", 1.2, "траву");
        Herbivores horse = new Herbivores("Horse", 2020, "Россия", 2.5, "траву");
        Predators giena = new Predators("Giena", 2016, "пустыня", 2.3, null);
        Predators bear = new Predators("Bear", 2021, "Сибирь", 2.0, "рыбу");
        Predators tigr = new Predators("Tiger", 2017, "Сибирь", 2.8, "мясо");
        Amphibians lyagushka = new Amphibians("Lyagushka", 2021, "болото");
        Amphibians uzh = new Amphibians("Uzh", 2021, null);
        FlyBirds chaika = new FlyBirds("chaika", 2020, "море", null);
        FlyBirds albatros = new FlyBirds("albatros", 2019, "море", null);
        FlyBirds sokol = new FlyBirds("sokol", 0, "лес", null);
        NotFlyBirds pavlin = new NotFlyBirds("pavlin", 2021, null, null);
        NotFlyBirds pingvin = new NotFlyBirds("pingvin", -5, "Антарктида", null);
        NotFlyBirds dodo = new NotFlyBirds("dodo", 2018, null, "гулять!");
        System.out.println(gazel + "класс: " + gazel.getClass());
        System.out.println(zhiraf + "класс: " + zhiraf.getClass());
        System.out.println(horse + "класс: " + horse.getClass());
        System.out.println(giena + "класс: " + giena.getClass());
        System.out.println(bear + "класс: " + bear.getClass());
        System.out.println(tigr + "класс: " + tigr.getClass());
        System.out.println(lyagushka + "класс: " + lyagushka.getClass());
        System.out.println(uzh + "класс: " + uzh.getClass());
        System.out.println(chaika + "класс: " + chaika.getClass());
        System.out.println(albatros + "класс: " + albatros.getClass());
        System.out.println(sokol + "класс: " + sokol.getClass());
        System.out.println(pavlin + "класс: " + pavlin.getClass());
        System.out.println(pingvin + "класс: " + pingvin.getClass());
        System.out.println(dodo + "класс: " + dodo.getClass());
        pingvin.go();
        System.out.println(bear.equals(tigr));
    }
}