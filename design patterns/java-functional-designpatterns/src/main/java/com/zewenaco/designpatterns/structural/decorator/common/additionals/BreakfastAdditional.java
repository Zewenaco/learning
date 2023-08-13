package com.zewenaco.designpatterns.structural.decorator.common.additionals;

import com.zewenaco.designpatterns.structural.decorator.common.trip.ITrip;

public class BreakfastAdditional extends TripAdditional{

  public BreakfastAdditional(ITrip trip) {
    super(trip);
  }

  @Override
  public String getDetails() {
    return super.getDetails() + " + Breakfast included";
  }

  @Override
  public double getPrice() {
    return super.getPrice() + 1000;
  }
}
