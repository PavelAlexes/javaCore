package Polymorphism.first;

class RockMusic implements Music {
    private String genre;

    public RockMusic(String genre) {
        setGenre(genre);
    }

    @Override
    public void play() {
        System.out.println("now playing slipknot!");
        System.out.println(this.getGenre());
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
