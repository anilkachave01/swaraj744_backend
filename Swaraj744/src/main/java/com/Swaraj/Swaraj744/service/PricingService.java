package com.Swaraj.Swaraj744.service;

import com.Swaraj.Swaraj744.enumtype.SeedType;

import com.Swaraj.Swaraj744.model.Component;
import org.springframework.stereotype.Service;

@Service
public class PricingService {

	public double calculate(Component component, Double acres, Integer pots, SeedType seedType) {
		double price = 0;
		if (component == null)
			return 0;

		double pricePerAcre = component.getPricePerAcre() != null ? component.getPricePerAcre() : 0;
		double pricePerPot = component.getPricePerPot() != null ? component.getPricePerPot() : 0;
		if (component.getName().toLowerCase().contains("thresher") && seedType != null) {
			switch (seedType) {
				case SOYABEAN:
					pricePerPot = 200;
					break;
				case TUR:
					pricePerPot = 400;
					break;
				case WHEAT:
				case GAHU:
					pricePerPot = 250;
					break;
				case HARBHARA:
					pricePerPot = 230;
					break;
				default:
					break;
			}
		}

		if (acres != null && acres > 0) {
			price += acres * pricePerAcre;
		}

		if (pots != null && pots > 0) {
			price += pots * pricePerPot;
		}

		return price;
	}

}
