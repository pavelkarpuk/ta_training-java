import planes.ExperimentalPlane;
import models.ClassificationLevel;
import models.ExperimentalType;
import models.MilitaryType;
import org.testng.Assert;
import org.testng.annotations.Test;
import planes.MilitaryPlane;
import planes.PassengerPlane;
import planes.AbstractPlane;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AirportTest {
    private static List<AbstractPlane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalType.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalType.VTOL, ClassificationLevel.TOP_SECRET)
    );

    private static final PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    @Test
    public void testGetTransportMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> expectedTransportMilitaryPlanes = Arrays.asList(
                new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)
        );

        List<MilitaryPlane> actualTransportMilitaryPlanes = airport.getTransportMilitaryPlanes();

        Assert.assertEquals(expectedTransportMilitaryPlanes, actualTransportMilitaryPlanes);
    }

    @Test
    public void testGetPassengerPlaneWithMaxCapacity() {
        Airport airport = new Airport(planes);

        PassengerPlane actualPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();

        Assert.assertEquals(planeWithMaxPassengerCapacity, actualPlaneWithMaxPassengersCapacity);
    }

    @Test
    public void testSortPlanesByMaxLoadCapacity() {
        Airport airport = new Airport(planes);
        planes.sort(Comparator.comparingInt(AbstractPlane:: getMaxLoadCapacity));

        List<? extends AbstractPlane> actualPlanesSortedByMaxLoadCapacity = airport.sortByMaxLoadCapacity().getPlanes();

        Assert.assertEquals(planes, actualPlanesSortedByMaxLoadCapacity);
    }

    @Test
    public void testGetBomberMilitaryPlanes() {
        Airport airport = new Airport(planes);
        List<MilitaryPlane> expectedBomberMilitaryPlanes = Arrays.asList(
                new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
                new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
                new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER)
        );

        List<MilitaryPlane> actualBomberMilitaryPlanes = airport.getBomberMilitaryPlanes();

        Assert.assertEquals(expectedBomberMilitaryPlanes, actualBomberMilitaryPlanes);
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        Airport airport = new Airport(planes);
        List <ExperimentalPlane> expectedExperimentalPlanesHigherThanUnclassified = Arrays.asList(
                new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalType.HIGH_ALTITUDE, ClassificationLevel.SECRET),
                new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalType.VTOL, ClassificationLevel.TOP_SECRET)
        );

        List <ExperimentalPlane> actualExperimentalPlanesHigherThanUnclassified = airport.getExperimentalPlanesWithClassificationLevelHigherThanUnclassified();

        Assert.assertEquals(expectedExperimentalPlanesHigherThanUnclassified, actualExperimentalPlanesHigherThanUnclassified);
    }
}