package model;

import java.util.Objects;

public class GoogleCloudPricingCalculator {

    private String numberOfInstances;
    private String operatingSystem;
    private String machineClass;
    private String series;
    private String machineType;
    private String gpuType;
    private String numberOfGPU;
    private String localSSD;
    private String datacenterLocation;
    private String committedUsage;

    public GoogleCloudPricingCalculator(String numberOfInstances, String operatingSystem, String machineClass,
                                        String series, String machineType, String gpuType, String numberOfGPU,
                                        String localSSD, String datacenterLocation, String committedUsage) {
        this.numberOfInstances = numberOfInstances;
        this.operatingSystem = operatingSystem;
        this.machineClass = machineClass;
        this.series = series;
        this.machineType = machineType;
        this.gpuType = gpuType;
        this.numberOfGPU = numberOfGPU;
        this.localSSD = localSSD;
        this.datacenterLocation = datacenterLocation;
        this.committedUsage = committedUsage;
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getMachineClass() {
        return machineClass;
    }

    public String getSeries() {
        return series;
    }

    public String getMachineType() {
        return machineType;
    }

    public String getGpuType() {
        return gpuType;
    }

    public String getNumberOfGPU() {
        return numberOfGPU;
    }

    public String getLocalSSD() {
        return localSSD;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public String getCommittedUsage() {
        return committedUsage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoogleCloudPricingCalculator that = (GoogleCloudPricingCalculator) o;
        return Objects.equals(numberOfInstances, that.numberOfInstances) && Objects.equals(operatingSystem, that.operatingSystem) && Objects.equals(machineClass, that.machineClass) && Objects.equals(series, that.series) && Objects.equals(machineType, that.machineType) && Objects.equals(gpuType, that.gpuType) && Objects.equals(numberOfGPU, that.numberOfGPU) && Objects.equals(localSSD, that.localSSD) && Objects.equals(datacenterLocation, that.datacenterLocation) && Objects.equals(committedUsage, that.committedUsage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfInstances, operatingSystem, machineClass, series, machineType, gpuType, numberOfGPU, localSSD, datacenterLocation, committedUsage);
    }

    @Override
    public String toString() {
        return "GoogleCloudPricingCalculator{" +
                "numberOfInstances='" + numberOfInstances + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", machineClass='" + machineClass + '\'' +
                ", series='" + series + '\'' +
                ", machineType='" + machineType + '\'' +
                ", gpuType='" + gpuType + '\'' +
                ", numberOfGPU='" + numberOfGPU + '\'' +
                ", localSSD='" + localSSD + '\'' +
                ", datacenterLocation='" + datacenterLocation + '\'' +
                ", committedUsage='" + committedUsage + '\'' +
                '}';
    }
}
