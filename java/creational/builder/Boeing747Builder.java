package designpatterns.java.creational.builder;

public class Boeing747Builder extends AircraftBuilder {
    Boeing747Builder boeing747;

    @Override
    public void buildCockpit() {

    }

    @Override
    public void buildEngine() {

    }

    @Override
    public void buildBathrooms() {
        
    }

    @Override
    public void buildWings() {

    }

    public IAircraft getResult() {
        return boeing747;
    }
}
