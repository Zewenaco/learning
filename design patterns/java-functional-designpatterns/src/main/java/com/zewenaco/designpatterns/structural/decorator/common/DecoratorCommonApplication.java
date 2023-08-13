package com.zewenaco.designpatterns.structural.decorator.common;

import com.zewenaco.designpatterns.structural.decorator.common.additionals.BreakfastAdditional;
import com.zewenaco.designpatterns.structural.decorator.common.additionals.LunchAdditional;
import com.zewenaco.designpatterns.structural.decorator.common.additionals.TripAdditional;
import com.zewenaco.designpatterns.structural.decorator.common.trip.BeachTrip;
import com.zewenaco.designpatterns.structural.decorator.common.trip.ITrip;

public class DecoratorCommonApplication {

  public static void main(String[] args) {
    ITrip beachTrip = new BeachTrip();
    TripAdditional beachTripUpgraded = new BreakfastAdditional(beachTrip);
    beachTripUpgraded = new LunchAdditional(beachTripUpgraded);

    System.out.printf("Trip: %s, Cost: %.1f",
            beachTripUpgraded.getDetails(),
            beachTripUpgraded.getPrice()
    );
  }
}
