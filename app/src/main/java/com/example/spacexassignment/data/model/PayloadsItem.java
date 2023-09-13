package com.example.spacexassignment.data.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PayloadsItem{

	@SerializedName("payload_type")
	private String payloadType;

	@SerializedName("payload_mass_kg")
	private double payloadMassKg;

	@SerializedName("payload_id")
	private String payloadId;

	@SerializedName("nationality")
	private String nationality;

	@SerializedName("norad_id")
	private List<Object> noradId;

	@SerializedName("customers")
	private List<String> customers;

	@SerializedName("orbit")
	private String orbit;

	@SerializedName("orbit_params")
	private OrbitParams orbitParams;

	@SerializedName("payload_mass_lbs")
	private double payloadMassLbs;

	@SerializedName("reused")
	private boolean reused;

	@SerializedName("manufacturer")
	private String manufacturer;

	@SerializedName("cargo_manifest")
	private Object cargoManifest;

	@SerializedName("cap_serial")
	private String capSerial;

	@SerializedName("mass_returned_lbs")
	private Object massReturnedLbs;

	@SerializedName("flight_time_sec")
	private int flightTimeSec;

	@SerializedName("mass_returned_kg")
	private Object massReturnedKg;

	@SerializedName("uid")
	private String uid;

	public void setPayloadType(String payloadType){
		this.payloadType = payloadType;
	}

	public String getPayloadType(){
		return payloadType;
	}

	public void setPayloadMassKg(double payloadMassKg){
		this.payloadMassKg = payloadMassKg;
	}

	public double getPayloadMassKg(){
		return payloadMassKg;
	}

	public void setPayloadId(String payloadId){
		this.payloadId = payloadId;
	}

	public String getPayloadId(){
		return payloadId;
	}

	public void setNationality(String nationality){
		this.nationality = nationality;
	}

	public String getNationality(){
		return nationality;
	}

	public void setNoradId(List<Object> noradId){
		this.noradId = noradId;
	}

	public List<Object> getNoradId(){
		return noradId;
	}

	public void setCustomers(List<String> customers){
		this.customers = customers;
	}

	public List<String> getCustomers(){
		return customers;
	}

	public void setOrbit(String orbit){
		this.orbit = orbit;
	}

	public String getOrbit(){
		return orbit;
	}

	public void setOrbitParams(OrbitParams orbitParams){
		this.orbitParams = orbitParams;
	}

	public OrbitParams getOrbitParams(){
		return orbitParams;
	}

	public void setPayloadMassLbs(double payloadMassLbs){
		this.payloadMassLbs = payloadMassLbs;
	}

	public double getPayloadMassLbs(){
		return payloadMassLbs;
	}

	public void setReused(boolean reused){
		this.reused = reused;
	}

	public boolean isReused(){
		return reused;
	}

	public void setManufacturer(String manufacturer){
		this.manufacturer = manufacturer;
	}

	public String getManufacturer(){
		return manufacturer;
	}

	public void setCargoManifest(Object cargoManifest){
		this.cargoManifest = cargoManifest;
	}

	public Object getCargoManifest(){
		return cargoManifest;
	}

	public void setCapSerial(String capSerial){
		this.capSerial = capSerial;
	}

	public String getCapSerial(){
		return capSerial;
	}

	public void setMassReturnedLbs(Object massReturnedLbs){
		this.massReturnedLbs = massReturnedLbs;
	}

	public Object getMassReturnedLbs(){
		return massReturnedLbs;
	}

	public void setFlightTimeSec(int flightTimeSec){
		this.flightTimeSec = flightTimeSec;
	}

	public int getFlightTimeSec(){
		return flightTimeSec;
	}

	public void setMassReturnedKg(Object massReturnedKg){
		this.massReturnedKg = massReturnedKg;
	}

	public Object getMassReturnedKg(){
		return massReturnedKg;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public String getUid(){
		return uid;
	}

	@Override
 	public String toString(){
		return 
			"PayloadsItem{" + 
			"payload_type = '" + payloadType + '\'' + 
			",payload_mass_kg = '" + payloadMassKg + '\'' + 
			",payload_id = '" + payloadId + '\'' + 
			",nationality = '" + nationality + '\'' + 
			",norad_id = '" + noradId + '\'' + 
			",customers = '" + customers + '\'' + 
			",orbit = '" + orbit + '\'' + 
			",orbit_params = '" + orbitParams + '\'' + 
			",payload_mass_lbs = '" + payloadMassLbs + '\'' + 
			",reused = '" + reused + '\'' + 
			",manufacturer = '" + manufacturer + '\'' + 
			",cargo_manifest = '" + cargoManifest + '\'' + 
			",cap_serial = '" + capSerial + '\'' + 
			",mass_returned_lbs = '" + massReturnedLbs + '\'' + 
			",flight_time_sec = '" + flightTimeSec + '\'' + 
			",mass_returned_kg = '" + massReturnedKg + '\'' + 
			",uid = '" + uid + '\'' + 
			"}";
		}
}