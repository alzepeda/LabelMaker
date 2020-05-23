package model;

public class Container {
    public Cassette[] cassettes;

    public Container(int cassetteAmount){
        cassettes = new Cassette[cassetteAmount];
    }
}
