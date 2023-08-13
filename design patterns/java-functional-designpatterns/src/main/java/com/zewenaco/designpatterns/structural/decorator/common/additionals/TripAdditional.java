package com.zewenaco.designpatterns.structural.decorator.common.additionals;

import com.zewenaco.designpatterns.structural.decorator.common.trip.ITrip;


public abstract class TripAdditional implements ITrip {

  private ITrip trip;

  public TripAdditional(ITrip trip) {
    this.trip = trip;
  }

  public double getPrice() {
    return trip.getPrice();
  }

  public String getDetails() {
    return trip.getDetails();
  }
}
