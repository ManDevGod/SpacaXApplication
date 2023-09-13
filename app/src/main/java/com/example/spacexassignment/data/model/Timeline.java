package com.example.spacexassignment.data.model;

import com.google.gson.annotations.SerializedName;

public class Timeline{

	@SerializedName("beco")
	private int beco;

	@SerializedName("second_stage_ignition")
	private int secondStageIgnition;

	@SerializedName("side_core_boostback")
	private int sideCoreBoostback;

	@SerializedName("payload_deploy")
	private int payloadDeploy;

	@SerializedName("stage1_lox_loading")
	private int stage1LoxLoading;

	@SerializedName("seco-2")
	private int seco2;

	@SerializedName("seco-1")
	private int seco1;

	@SerializedName("stage2_lox_loading")
	private int stage2LoxLoading;

	@SerializedName("ignition")
	private int ignition;

	@SerializedName("seco-4")
	private int seco4;

	@SerializedName("prelaunch_checks")
	private int prelaunchChecks;

	@SerializedName("seco-3")
	private int seco3;

	@SerializedName("stage2_rp1_loading")
	private int stage2Rp1Loading;

	@SerializedName("center_core_landing")
	private int centerCoreLanding;

	@SerializedName("side_core_landing")
	private int sideCoreLanding;

	@SerializedName("liftoff")
	private int liftoff;

	@SerializedName("center_stage_sep")
	private int centerStageSep;

	@SerializedName("stage1_rp1_loading")
	private int stage1Rp1Loading;

	@SerializedName("side_core_entry_burn")
	private int sideCoreEntryBurn;

	@SerializedName("webcast_liftoff")
	private int webcastLiftoff;

	@SerializedName("second_stage_restart")
	private int secondStageRestart;

	@SerializedName("propellant_pressurization")
	private int propellantPressurization;

	@SerializedName("engine_chill")
	private int engineChill;

	@SerializedName("meco")
	private int meco;

	@SerializedName("go_for_prop_loading")
	private int goForPropLoading;

	@SerializedName("fairing_deploy")
	private int fairingDeploy;

	@SerializedName("go_for_launch")
	private int goForLaunch;

	@SerializedName("center_core_entry_burn")
	private int centerCoreEntryBurn;

	@SerializedName("side_core_sep")
	private int sideCoreSep;

	@SerializedName("maxq")
	private int maxq;

	@SerializedName("rp1_loading")
	private int rp1Loading;

	@SerializedName("first_stage_landing")
	private int firstStageLanding;

	@SerializedName("first_stage_entry_burn")
	private int firstStageEntryBurn;

	@SerializedName("stage_sep")
	private int stageSep;

	@SerializedName("first_stage_boostback_burn")
	private int firstStageBoostbackBurn;

	@SerializedName("dragon_solar_deploy")
	private int dragonSolarDeploy;

	@SerializedName("dragon_bay_door_deploy")
	private int dragonBayDoorDeploy;

	@SerializedName("dragon_separation")
	private int dragonSeparation;

	@SerializedName("first_stage_landing_burn")
	private int firstStageLandingBurn;

	@SerializedName("payload_deploy_2")
	private int payloadDeploy2;

	@SerializedName("payload_deploy_1")
	private int payloadDeploy1;

	@SerializedName("center_core_boostback")
	private int centerCoreBoostback;

	@SerializedName("webcast_launch")
	private int webcastLaunch;

	public void setBeco(int beco){
		this.beco = beco;
	}

	public int getBeco(){
		return beco;
	}

	public void setSecondStageIgnition(int secondStageIgnition){
		this.secondStageIgnition = secondStageIgnition;
	}

	public int getSecondStageIgnition(){
		return secondStageIgnition;
	}

	public void setSideCoreBoostback(int sideCoreBoostback){
		this.sideCoreBoostback = sideCoreBoostback;
	}

	public int getSideCoreBoostback(){
		return sideCoreBoostback;
	}

	public void setPayloadDeploy(int payloadDeploy){
		this.payloadDeploy = payloadDeploy;
	}

	public int getPayloadDeploy(){
		return payloadDeploy;
	}

	public void setStage1LoxLoading(int stage1LoxLoading){
		this.stage1LoxLoading = stage1LoxLoading;
	}

	public int getStage1LoxLoading(){
		return stage1LoxLoading;
	}

	public void setSeco2(int seco2){
		this.seco2 = seco2;
	}

	public int getSeco2(){
		return seco2;
	}

	public void setSeco1(int seco1){
		this.seco1 = seco1;
	}

	public int getSeco1(){
		return seco1;
	}

	public void setStage2LoxLoading(int stage2LoxLoading){
		this.stage2LoxLoading = stage2LoxLoading;
	}

	public int getStage2LoxLoading(){
		return stage2LoxLoading;
	}

	public void setIgnition(int ignition){
		this.ignition = ignition;
	}

	public int getIgnition(){
		return ignition;
	}

	public void setSeco4(int seco4){
		this.seco4 = seco4;
	}

	public int getSeco4(){
		return seco4;
	}

	public void setPrelaunchChecks(int prelaunchChecks){
		this.prelaunchChecks = prelaunchChecks;
	}

	public int getPrelaunchChecks(){
		return prelaunchChecks;
	}

	public void setSeco3(int seco3){
		this.seco3 = seco3;
	}

	public int getSeco3(){
		return seco3;
	}

	public void setStage2Rp1Loading(int stage2Rp1Loading){
		this.stage2Rp1Loading = stage2Rp1Loading;
	}

	public int getStage2Rp1Loading(){
		return stage2Rp1Loading;
	}

	public void setCenterCoreLanding(int centerCoreLanding){
		this.centerCoreLanding = centerCoreLanding;
	}

	public int getCenterCoreLanding(){
		return centerCoreLanding;
	}

	public void setSideCoreLanding(int sideCoreLanding){
		this.sideCoreLanding = sideCoreLanding;
	}

	public int getSideCoreLanding(){
		return sideCoreLanding;
	}

	public void setLiftoff(int liftoff){
		this.liftoff = liftoff;
	}

	public int getLiftoff(){
		return liftoff;
	}

	public void setCenterStageSep(int centerStageSep){
		this.centerStageSep = centerStageSep;
	}

	public int getCenterStageSep(){
		return centerStageSep;
	}

	public void setStage1Rp1Loading(int stage1Rp1Loading){
		this.stage1Rp1Loading = stage1Rp1Loading;
	}

	public int getStage1Rp1Loading(){
		return stage1Rp1Loading;
	}

	public void setSideCoreEntryBurn(int sideCoreEntryBurn){
		this.sideCoreEntryBurn = sideCoreEntryBurn;
	}

	public int getSideCoreEntryBurn(){
		return sideCoreEntryBurn;
	}

	public void setWebcastLiftoff(int webcastLiftoff){
		this.webcastLiftoff = webcastLiftoff;
	}

	public int getWebcastLiftoff(){
		return webcastLiftoff;
	}

	public void setSecondStageRestart(int secondStageRestart){
		this.secondStageRestart = secondStageRestart;
	}

	public int getSecondStageRestart(){
		return secondStageRestart;
	}

	public void setPropellantPressurization(int propellantPressurization){
		this.propellantPressurization = propellantPressurization;
	}

	public int getPropellantPressurization(){
		return propellantPressurization;
	}

	public void setEngineChill(int engineChill){
		this.engineChill = engineChill;
	}

	public int getEngineChill(){
		return engineChill;
	}

	public void setMeco(int meco){
		this.meco = meco;
	}

	public int getMeco(){
		return meco;
	}

	public void setGoForPropLoading(int goForPropLoading){
		this.goForPropLoading = goForPropLoading;
	}

	public int getGoForPropLoading(){
		return goForPropLoading;
	}

	public void setFairingDeploy(int fairingDeploy){
		this.fairingDeploy = fairingDeploy;
	}

	public int getFairingDeploy(){
		return fairingDeploy;
	}

	public void setGoForLaunch(int goForLaunch){
		this.goForLaunch = goForLaunch;
	}

	public int getGoForLaunch(){
		return goForLaunch;
	}

	public void setCenterCoreEntryBurn(int centerCoreEntryBurn){
		this.centerCoreEntryBurn = centerCoreEntryBurn;
	}

	public int getCenterCoreEntryBurn(){
		return centerCoreEntryBurn;
	}

	public void setSideCoreSep(int sideCoreSep){
		this.sideCoreSep = sideCoreSep;
	}

	public int getSideCoreSep(){
		return sideCoreSep;
	}

	public void setMaxq(int maxq){
		this.maxq = maxq;
	}

	public int getMaxq(){
		return maxq;
	}

	public void setRp1Loading(int rp1Loading){
		this.rp1Loading = rp1Loading;
	}

	public int getRp1Loading(){
		return rp1Loading;
	}

	public void setFirstStageLanding(int firstStageLanding){
		this.firstStageLanding = firstStageLanding;
	}

	public int getFirstStageLanding(){
		return firstStageLanding;
	}

	public void setFirstStageEntryBurn(int firstStageEntryBurn){
		this.firstStageEntryBurn = firstStageEntryBurn;
	}

	public int getFirstStageEntryBurn(){
		return firstStageEntryBurn;
	}

	public void setStageSep(int stageSep){
		this.stageSep = stageSep;
	}

	public int getStageSep(){
		return stageSep;
	}

	public void setFirstStageBoostbackBurn(int firstStageBoostbackBurn){
		this.firstStageBoostbackBurn = firstStageBoostbackBurn;
	}

	public int getFirstStageBoostbackBurn(){
		return firstStageBoostbackBurn;
	}

	public void setDragonSolarDeploy(int dragonSolarDeploy){
		this.dragonSolarDeploy = dragonSolarDeploy;
	}

	public int getDragonSolarDeploy(){
		return dragonSolarDeploy;
	}

	public void setDragonBayDoorDeploy(int dragonBayDoorDeploy){
		this.dragonBayDoorDeploy = dragonBayDoorDeploy;
	}

	public int getDragonBayDoorDeploy(){
		return dragonBayDoorDeploy;
	}

	public void setDragonSeparation(int dragonSeparation){
		this.dragonSeparation = dragonSeparation;
	}

	public int getDragonSeparation(){
		return dragonSeparation;
	}

	public void setFirstStageLandingBurn(int firstStageLandingBurn){
		this.firstStageLandingBurn = firstStageLandingBurn;
	}

	public int getFirstStageLandingBurn(){
		return firstStageLandingBurn;
	}

	public void setPayloadDeploy2(int payloadDeploy2){
		this.payloadDeploy2 = payloadDeploy2;
	}

	public int getPayloadDeploy2(){
		return payloadDeploy2;
	}

	public void setPayloadDeploy1(int payloadDeploy1){
		this.payloadDeploy1 = payloadDeploy1;
	}

	public int getPayloadDeploy1(){
		return payloadDeploy1;
	}

	public void setCenterCoreBoostback(int centerCoreBoostback){
		this.centerCoreBoostback = centerCoreBoostback;
	}

	public int getCenterCoreBoostback(){
		return centerCoreBoostback;
	}

	public void setWebcastLaunch(int webcastLaunch){
		this.webcastLaunch = webcastLaunch;
	}

	public int getWebcastLaunch(){
		return webcastLaunch;
	}

	@Override
 	public String toString(){
		return 
			"Timeline{" + 
			"beco = '" + beco + '\'' + 
			",second_stage_ignition = '" + secondStageIgnition + '\'' + 
			",side_core_boostback = '" + sideCoreBoostback + '\'' + 
			",payload_deploy = '" + payloadDeploy + '\'' + 
			",stage1_lox_loading = '" + stage1LoxLoading + '\'' + 
			",seco-2 = '" + seco2 + '\'' + 
			",seco-1 = '" + seco1 + '\'' + 
			",stage2_lox_loading = '" + stage2LoxLoading + '\'' + 
			",ignition = '" + ignition + '\'' + 
			",seco-4 = '" + seco4 + '\'' + 
			",prelaunch_checks = '" + prelaunchChecks + '\'' + 
			",seco-3 = '" + seco3 + '\'' + 
			",stage2_rp1_loading = '" + stage2Rp1Loading + '\'' + 
			",center_core_landing = '" + centerCoreLanding + '\'' + 
			",side_core_landing = '" + sideCoreLanding + '\'' + 
			",liftoff = '" + liftoff + '\'' + 
			",center_stage_sep = '" + centerStageSep + '\'' + 
			",stage1_rp1_loading = '" + stage1Rp1Loading + '\'' + 
			",side_core_entry_burn = '" + sideCoreEntryBurn + '\'' + 
			",webcast_liftoff = '" + webcastLiftoff + '\'' + 
			",second_stage_restart = '" + secondStageRestart + '\'' + 
			",propellant_pressurization = '" + propellantPressurization + '\'' + 
			",engine_chill = '" + engineChill + '\'' + 
			",meco = '" + meco + '\'' + 
			",go_for_prop_loading = '" + goForPropLoading + '\'' + 
			",fairing_deploy = '" + fairingDeploy + '\'' + 
			",go_for_launch = '" + goForLaunch + '\'' + 
			",center_core_entry_burn = '" + centerCoreEntryBurn + '\'' + 
			",side_core_sep = '" + sideCoreSep + '\'' + 
			",maxq = '" + maxq + '\'' + 
			",rp1_loading = '" + rp1Loading + '\'' + 
			",first_stage_landing = '" + firstStageLanding + '\'' + 
			",first_stage_entry_burn = '" + firstStageEntryBurn + '\'' + 
			",stage_sep = '" + stageSep + '\'' + 
			",first_stage_boostback_burn = '" + firstStageBoostbackBurn + '\'' + 
			",dragon_solar_deploy = '" + dragonSolarDeploy + '\'' + 
			",dragon_bay_door_deploy = '" + dragonBayDoorDeploy + '\'' + 
			",dragon_separation = '" + dragonSeparation + '\'' + 
			",first_stage_landing_burn = '" + firstStageLandingBurn + '\'' + 
			",payload_deploy_2 = '" + payloadDeploy2 + '\'' + 
			",payload_deploy_1 = '" + payloadDeploy1 + '\'' + 
			",center_core_boostback = '" + centerCoreBoostback + '\'' + 
			",webcast_launch = '" + webcastLaunch + '\'' + 
			"}";
		}
}