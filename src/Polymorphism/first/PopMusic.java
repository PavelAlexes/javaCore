package Polymorphism.first;

class PopMusic implements Music {
    private String genre;

    PopMusic(String genre) {
        setGenre(genre);
    }

    @Override
    public void play() {
        System.out.println("now playing Lady Gaga!");
        System.out.println(this.getGenre());
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
