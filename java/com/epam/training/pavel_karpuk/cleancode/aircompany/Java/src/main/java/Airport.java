import planes.ExperimentalPlane;
import models.ClassificationLevel;
import models.MilitaryType;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.AbstractPlane;

import java.util.*;

public class Airport {
    private List<? extends AbstractPlane> planes;

    public Airport(List<? extends AbstractPlane> planes) {
        this.planes = planes;
    }

    public List<PassengerPlane> getPassengerPlanes() {
        List<PassengerPlane> passengerPlanes = new ArrayList<>();
        for (AbstractPlane plane : planes) {
            if (plane instanceof PassengerPlane) {
                passengerPlanes.add((PassengerPlane) plane);
            }
        }
        return passengerPlanes;
    }

    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (AbstractPlane plane : planes) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }

    public List<ExperimentalPlane> getExperimentalPlanes() {
        List<ExperimentalPlane> experimentalPlanes = new ArrayList<>();
        for (AbstractPlane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                experimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        PassengerPlane passengerPlaneWithMaxPassengersCapacity = getPassengerPlanes().get(0);
        for (PassengerPlane passengerPlane : getPassengerPlanes()) {
            if (passengerPlane.getPassengersCapacity() > passengerPlaneWithMaxPassengersCapacity.getPassengersCapacity()) {
                passengerPlaneWithMaxPassengersCapacity = passengerPlane;
            }
        }
        return passengerPlaneWithMaxPassengersCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        for (MilitaryPlane plane : getMilitaryPlanes()) {
            if (plane.getMilitaryType() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(plane);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        for (MilitaryPlane plane : getMilitaryPlanes()) {
            if (plane.getMilitaryType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }

    public List <ExperimentalPlane> getExperimentalPlanesWithClassificationLevelHigherThanUnclassified(){
        List <ExperimentalPlane> experimentalPlanesHigherThanUnclassified = new ArrayList<>();
        for (ExperimentalPlane plane : getExperimentalPlanes()) {
            if (plane.getClassificationLevel() != ClassificationLevel.UNCLASSIFIED) {
                experimentalPlanesHigherThanUnclassified.add(plane);
            }
        }
        return experimentalPlanesHigherThanUnclassified;
    }

    public Airport sortByMaxDistance() {
        planes.sort(Comparator.comparingInt(AbstractPlane::getMaxFlightDistance));
        return this;
    }

    public Airport sortByMaxSpeed() {
        planes.sort(Comparator.comparingInt(AbstractPlane::getMaxSpeed));
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        planes.sort(Comparator.comparingInt(AbstractPlane::getMaxLoadCapacity));
        return this;
    }

    public List<? extends AbstractPlane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends AbstractPlane> collection) {
        collection.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }
}
