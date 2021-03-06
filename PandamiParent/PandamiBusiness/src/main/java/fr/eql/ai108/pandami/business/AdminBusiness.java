package fr.eql.ai108.pandami.business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.eql.ai108.pandami.entity.Activity;
import fr.eql.ai108.pandami.entity.ActivityCategory;
import fr.eql.ai108.pandami.entity.CancelReason;
import fr.eql.ai108.pandami.entity.City;
import fr.eql.ai108.pandami.entity.Demand;
import fr.eql.ai108.pandami.entity.DesistReason;
import fr.eql.ai108.pandami.entity.EndedType;
import fr.eql.ai108.pandami.entity.EquipmentType;
import fr.eql.ai108.pandami.entity.Gender;
import fr.eql.ai108.pandami.entity.ReportIssue;
import fr.eql.ai108.pandami.entity.UserType;
import fr.eql.ai108.pandami.ibusiness.AdminIBusiness;
import fr.eql.ai108.pandami.idao.ActivityCategoryIDao;
import fr.eql.ai108.pandami.idao.ActivityIDao;
import fr.eql.ai108.pandami.idao.CancelReasonIDao;
import fr.eql.ai108.pandami.idao.CityIDao;
import fr.eql.ai108.pandami.idao.DesistReasonIDao;
import fr.eql.ai108.pandami.idao.EndedTypeIDao;
import fr.eql.ai108.pandami.idao.EquipmentTypeIDao;
import fr.eql.ai108.pandami.idao.GenderIDao;
import fr.eql.ai108.pandami.idao.ReportIssueIDao;
import fr.eql.ai108.pandami.idao.UserTypeIDao;

@Remote (AdminIBusiness.class)
@Stateless
public class AdminBusiness implements AdminIBusiness{
	
	@EJB 
	private ActivityIDao proxyActivity;
	@EJB
	private ActivityCategoryIDao proxyActivityCategory;
	@EJB
	private CityIDao proxyCity;
	@EJB
	private EquipmentTypeIDao proxyEquipmentType;



	@Override
	public List<Activity> displayActivities() {
		return proxyActivity.findAll();
	}
	@Override
	public List<ActivityCategory> displayCategories() {
		return proxyActivityCategory.findAll();
	}

	@Override
	public List<City> displayCities() {
		return proxyCity.findAll();
	}
	@Override
	public List<EquipmentType> displayEquipmentTypes() {
		return proxyEquipmentType.findAll();
	}


	@Override
	public City upDateCity(City selectedCity) {
		City returnedCity = proxyCity.update(selectedCity);
		return returnedCity;
	}

	@Override
	public City addCity(City selectedCity) {
		City returnedCity = null;
		returnedCity = proxyCity.add(selectedCity);
		return returnedCity;
	}
	@Override
	public Activity upDateActivity(Activity selectedActivity) {
		Activity returnedActivity = proxyActivity.update(selectedActivity);
		return returnedActivity;
	}
	@Override
	public Activity addActivity(Activity selectedActivity) {
		Activity returnedActivity = null;
		returnedActivity = proxyActivity.add(selectedActivity);
		return returnedActivity;
	}
	@Override
	public ActivityCategory upDateCategory(ActivityCategory selectedActivityCategory) {
		ActivityCategory returnedCategory = proxyActivityCategory.update(selectedActivityCategory);
		return returnedCategory;
	}
	@Override
	public ActivityCategory addCategory(ActivityCategory selectedActivityCategory) {
		ActivityCategory returnedCategory = null;
		returnedCategory = proxyActivityCategory.add(selectedActivityCategory);
		return returnedCategory;
	}
	@Override
	public EquipmentType upDateEquipment(EquipmentType selectedEquipmentType) {
		EquipmentType returnedEquipment = proxyEquipmentType.update(selectedEquipmentType);
		return returnedEquipment;
	}
	@Override
	public EquipmentType addEquipment(EquipmentType selectedEquipmentType) {
		EquipmentType returnedEquipment = null;
		returnedEquipment = proxyEquipmentType.add(selectedEquipmentType);
		return returnedEquipment;
	}



	
}
