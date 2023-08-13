package com.zewenaco.designpatterns.structural.decorator.functional;

import com.zewenaco.designpatterns.structural.decorator.common.additionals.BreakfastAdditional;
import com.zewenaco.designpatterns.structural.decorator.common.additionals.LunchAdditional;
import com.zewenaco.designpatterns.structural.decorator.common.trip.BeachTrip;
import com.zewenaco.designpatterns.structural.decorator.common.trip.ITrip;

public class DecoratorFunctionalApplication {

  public static void main(String[] args) {
    ITrip trip =
            new TripAdditional(BreakfastAdditional::new)
                    .use(new TripAdditional(LunchAdditional::new)
                            .use(new BeachTrip())
                    );
    System.out.printf("Trip: %s, Cost: %.1f", trip.getDetails(), trip.getPrice());
  }
}
