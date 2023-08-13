package com.zewenaco.designpatterns.structural.decorator.functional;

import com.zewenaco.designpatterns.structural.decorator.common.trip.ITrip;

import java.util.function.Function;

public class TripAdditional {
  Function<ITrip, ITrip> decoration;

  public TripAdditional(Function<ITrip, ITrip> decoration) {
    this.decoration = decoration;
  }

  public ITrip use(ITrip baseTrip) {
    return decoration.apply(baseTrip);
  }
}
