package com.zewenaco.designpatterns.structural.decorator.common.additionals;

import com.zewenaco.designpatterns.structural.decorator.common.trip.ITrip;


public class LunchAdditional extends TripAdditional{

  public LunchAdditional(ITrip trip) {
    super(trip);
  }

  @Override
  public String getDetails() {
    return super.getDetails() + " + Lunch included";
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 2000;
  }
}
